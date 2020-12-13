package filehandling;

import java.util.Collections;
import java.util.List;

import data.structure.File;
import data.structure.FileList;
import data.structure.FileNameComparator;

public class FileHandling implements FileHandlingInterface {

	private FileList fileList;
	
	public FileHandling() {
		super();
	}
	
	public FileHandling(FileList fileList) {
		super();
		this.fileList = fileList;
	}
	
	public FileList getFileList() {
		return fileList;
	}

	public void setFileList(FileList fileList) {
		this.fileList = fileList;
	}
	
	public void sortFiles() {
		return Collections.sort(fileList);
	}

	@Override
	public void viewFiles() {
		
	}

	@Override
	public void addFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFile(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
	

}
