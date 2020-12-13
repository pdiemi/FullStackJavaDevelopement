package data.structure;

import java.util.ArrayList;

public class FileList {

	private ArrayList<File> fireList;

	public FileList() {
		super();
	}

	public FileList(ArrayList<File> fireList) {
		super();
		this.fireList = fireList;
	}

	public ArrayList<File> getFireList() {
		return fireList;
	}

	public void setFireList(ArrayList<File> fireList) {
		this.fireList = fireList;
	}

	@Override
	public String toString() {
		return "FileList [fireList=" + fireList + "]";
	}
	
}
