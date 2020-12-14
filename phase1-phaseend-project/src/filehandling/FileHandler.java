package filehandling;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;

import data.structure.FileNameComparator;
import driver.FileHandlingDisplay;
import exceptions.*;

public class FileHandler implements FileHandlerInterface {

	public static final int MAIN_DISPLAY_CHOICES = 4;
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
			// Collections.sort(fileList, new FileNameComparator());
			System.out.println("");
			for (File file : fileList) {
				System.out.println(file.getName());
			}
			System.out.println("");
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
			 * Take confirmation from user to
			 * continue operating a file
			 * */
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
			 * Take confirmation from user to
			 * continue operating a file
			 * */
			do {
			isContinued = chooseAction(SUB_DISPLAY_CHOICES);
			} while (isContinued == -1);
			
			// Input fileName
			if (isContinued != 0) {
				do {
					fileName = inputFileName();
				} while (fileName == null);
				// Search for fileName in the directory;
				
			}
		} while (isContinued != 0);

	}

	@Override
	public void deleteFile() {
		if (fileList == null) {
			System.out.println("This directory is empty");
			return;
		}
		FileHandlingDisplay displayOptions = new FileHandlingDisplay();
		String fileName;
		
		int isContinued; // Equals to 0 if user chose to exit sub-display
		do {
			// Show Delete display
			displayOptions.deleteDisplay();
			/*
			 * Take confirmation from user to
			 * continue operating a file
			 * */
			do {
			isContinued = chooseAction(SUB_DISPLAY_CHOICES);
			} while (isContinued == -1);
			
			// Input fileName
			if (isContinued != 0) {
				do {
					fileName = inputFileName();
				} while (fileName == null);
				// Delete fileName from the directory;
				
			}
		} while (isContinued != 0);

	}

	@Override
	public void updateFile() {
		// TODO Auto-generated method stub

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
				//choice = -1; // Reset choice
			}
		} while (choice != 0);

		// User chose to exit the application
		System.out.println("Application is closed. Goodbye!");
	}

}
