package filehandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import comparators.FileNameComparatorAsc;
import driver.FileHandlingDisplay;
import exceptions.FileNameIsNullException;
import exceptions.FileNameIsTooLongException;
import exceptions.UserChoiceIsInvalidException;

public class FileHandler implements FileHandlerInterface {
	/*
	 * Number of choices from the main display and sub-display exclude option to
	 * exit the display
	 */
	public static final int MAIN_DISPLAY_CHOICES = 5;
	public static final int SUB_DISPLAY_CHOICES = 1;

	private File[] fileList;
	private String directoryPathString;

	public FileHandler() {
		super();
	}

	public FileHandler(File[] fileList) {
		super();
		this.fileList = fileList;
	}

	public FileHandler(String directoryPathString) {
		this.directoryPathString = directoryPathString;
		// Creating a File object for directory
		File directoryPath = new File(directoryPathString);

		// List of all files and directories
		this.fileList = directoryPath.listFiles();

	}

	public File[] getFileList() {
		return fileList;
	}

	public void setFileList(File[] fileList) {
		this.fileList = fileList;
	}

	@Override
	public void viewFiles() {
		/*
		 * This method lists all files and directory in fireList in ascending order
		 */
		if (fileList == null)
			System.out.println("There is no file or directory to display");
		else {
			// Sort and print fileList in ascending order
			
			int viewChoice;
			System.out.println("Enter 0 to view all files and directories in current directory.");
			System.out.println("Enter 1 to view all files in the application.");
			viewChoice = chooseAction(1);
			
			switch (viewChoice) {
			case 0:
				Arrays.sort(fileList, new FileNameComparatorAsc());
				System.out.println("");
				for (File file : fileList) {
					System.out.println(file.getName());
				}
				System.out.println("");
				break;
			case 1:
				List<File> allFiles = new ArrayList<>();
				dumbDirectory(directoryPathString, allFiles);
				Collections.sort(allFiles, new FileNameComparatorAsc());
				System.out.println("");
				for (File file : allFiles) {
					System.out.println(file.getName());
				}
				System.out.println("");
				break;
			}
			
		}
	}

	public void dumbDirectory(String directoryName, List<File> files) {

		File directory = new File(directoryName);
	    File[] fileList = directory.listFiles();
	    
		if (fileList != null)
			for (File file : fileList) {
				if (file.isFile()) {
					files.add(file);
				} else if (file.isDirectory()) {
					dumbDirectory(file.getAbsolutePath(), files);
				}
			}
	}

	@Override
	public void addFile() {
		FileHandlingDisplay displayOptions = new FileHandlingDisplay();
		String fileName;

		int isContinued; // Equals to 0 if user chose to exit sub-display
		do {
			// Show Add display
			displayOptions.addDisplay();
			/*
			 * Take confirmation from user to continue operating a file
			 */
			do {
				isContinued = chooseAction(SUB_DISPLAY_CHOICES);
			} while (isContinued == -1);

			// Input fileName
			if (isContinued != 0) {
				do {
					fileName = inputFileName();
				} while (fileName == null);
				// Add fileName to the directory;
			}
		} while (isContinued != 0);
	}

	@Override
	public void searchFile() {
		/*
		 * This method searches for a file or directory in the directory by name and
		 * display name, absolute path, and size of the result(s) as well as number of
		 * results found.
		 */
		if (fileList == null) {
			System.out.println("This directory is empty");
			return;
		}
		FileHandlingDisplay displayOptions = new FileHandlingDisplay();
		String fileName;

		int isContinued; // Equals to 0 if user chose to exit sub-display
		do {
			// Show Search display
			displayOptions.searchDisplay();
			/*
			 * Take confirmation from user to continue operating a file
			 */
			do {
				isContinued = chooseAction(SUB_DISPLAY_CHOICES);
			} while (isContinued == -1);

			// Input fileName
			if (isContinued != 0) {
				do {
					fileName = inputFileName();
				} while (fileName == null);
				// Search for fileName in the directory;
				int countFind = 0;
				countFind = _searchFile(fileName, fileList, countFind);

				System.out.println("-----");
				System.out.println("Searching completed. " + countFind + " found.");

			}
		} while (isContinued != 0);

	}

	public int _searchFile(String fileName, File[] fileList, int countFind) {
		/*
		 * This method is a wrapper function for searchFile()
		 */

		for (File file : fileList) {
			if (file.getName().matches(fileName) || file.getName().matches(fileName + ".*")) {
				System.out.println("-----");
				System.out.println("Name: " + file.getName());
				System.out.println("Path: " + file.getAbsolutePath());
				System.out.println("Size: " + file.length());
				countFind++;
			}
			if (file.isDirectory()) {
				File subFileList[] = file.listFiles();
				_searchFile(fileName, subFileList, countFind);
			}
		}
		return countFind;
	}

	public String _searchExactFile(String fileName, File[] fileList) {
		/*
		 * This method is a wrapper function for deleteFile(). Returns absolute path of
		 * fileName if found. Otherwise, returns null.
		 */
		for (File file : fileList) {
			if (file.getName().matches(fileName)) {
				return file.getAbsolutePath();
			}
		}
		return null;
	}

	@Override
	public void deleteFile() {
		if (fileList == null) {
			System.out.println("This directory is empty");
			return;
		}
		FileHandlingDisplay displayOptions = new FileHandlingDisplay();
		String fileName;
		boolean isDeleted = false;

		int isContinued; // Equals to 0 if user chose to exit sub-display
		do {
			// Show Delete display
			displayOptions.deleteDisplay();
			/*
			 * Take confirmation from user to continue operating a file
			 */
			do {
				isContinued = chooseAction(SUB_DISPLAY_CHOICES);
			} while (isContinued == -1);

			// Input fileName
			if (isContinued != 0) {
				do {
					fileName = inputFileName();
				} while (fileName == null);
				// Delete fileName from the directory;
				String fileNameToDelete = _searchExactFile(fileName, fileList);
				if (fileNameToDelete == null) {
					System.out.println(fileName + " does not exist");
				} else {
					try {
						File fileToDelete = new File(fileNameToDelete);
						isDeleted = _deleteFile(fileToDelete);
						if (isDeleted) {
							System.out.println(fileName + " is deleted");
							// Refresh fileList
							refreshFileList();
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} while (isContinued != 0);

	}

	public static boolean _deleteFile(File fileToDelete) {
		// This method is a wrapper function for deleteFile
		File[] files = fileToDelete.listFiles();
		// If
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory())
					_deleteFile(file);
				else
					file.delete();
			}
		}
		return fileToDelete.delete();
	}

	@Override
	public void updateFile() {
		// TODO Auto-generated method stub

	}

	public void refreshFileList() {
		/*
		 * This method refreshes the fileList
		 */
		fileList = new File(directoryPathString).listFiles();
	}

	public String inputFileName() {
		/*
		 * This method takes a fileName input by user and validates the input. A valid
		 * fileName must not be null and not longer than 128 characters. Returns null if
		 * fileName is invalid. Otherwise, returns fileName.
		 */
		String fileName = null;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter file/directory name: ");
			fileName = scan.next();
			if (fileName.isEmpty())
				throw new FileNameIsNullException("filename is null");
			else if (fileName.length() > 128)
				throw new FileNameIsTooLongException("filename is too long");
		} catch (FileNameIsNullException | FileNameIsTooLongException e) {
			System.out.println("Invalid input. " + "File name cannot be empty and contain "
					+ "more than 128 characters. Please try again!");
			return null;
		}

		return fileName;
	}

	public int chooseAction(final int MAX_CHOICE) {
		/*
		 * This method takes input from user for user's action choice from the main
		 * display
		 */
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		try {
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();
			if (choice < 0 || choice > MAX_CHOICE) {
				throw new UserChoiceIsInvalidException("invalid input");
			}
		} catch (UserChoiceIsInvalidException e) {
			System.out.println("Invalid input. Please try again!");
			return -1;
		} catch (Exception e) {
			System.out.println("Invalid input. Please try again!");
			return -1;
		}

		return choice;
	}

	public void performAction(int choice) {

		switch (choice) {
		case 1:
			viewFiles();
			break;
		case 2:
			addFile();
			break;
		case 3:
			deleteFile();
			break;
		case 4:
			searchFile();
			break;
		case 5:
			refreshFileList();
			break;
		default:
			break;
		}
	}

	public void run() {
		// Display welcome screen
		FileHandlingDisplay displayOptions = new FileHandlingDisplay();
		displayOptions.welcomeDisplay();

		// Perform user's chosen action
		int choice;
		do {
			// Display the main screen
			displayOptions.mainDisplay();

			// Take input from user for user's choice of action
			do {
				choice = chooseAction(MAIN_DISPLAY_CHOICES);
			} while (choice == -1);

			// Perform user's chosen action
			if (choice != 0) {
				performAction(choice);
				// choice = -1; // Reset choice
			}
		} while (choice != 0);

		// User chose to exit the application

		System.out.println("");
		System.out.println("Application is closed. Goodbye!");
	}

}
