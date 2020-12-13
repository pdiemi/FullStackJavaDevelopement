package data.structure;

public class File implements Comparable<File>{
	private int fileId;
	private String fileName;
	
	public File() {
		fileId = -1;
		fileName = null;
	}

	public File(int fileId, String fileName) {
		this.fileId = fileId;
		this.fileName = fileName;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "File [fileId=" + fileId + ", fileName=" + fileName + "]";
	}

	@Override
	public int compareTo(File o) {
		// TODO Auto-generated method stub
		return this.getFileName().compareTo(o.getFileName());
	}
	
}
