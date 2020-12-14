package driver;

import filehandling.FileHandler;

public class FileHandlingMain {

	public static void main(String[] args) {
		
		// Create a file handler for ".\resources" directory
		String directoryPathString = ".\\resources";
		FileHandler fileHandler = new FileHandler(directoryPathString);

		// Run the file handler
		fileHandler.run();
	}

}
