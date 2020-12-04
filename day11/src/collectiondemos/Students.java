package collectiondemos;

public class Students implements Comparable<Students>{

	String stuId;
	String stuName;
	String stuCity;
	String stuSubject;

	public Students(String stuId, String stuName, String stuCity, String stuSubject) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.stuSubject = stuSubject;
	}

	@Override
	public String toString() {
		return "Students [stuId=" + stuId + ", stuName=" + stuName + ", stuCity=" + stuCity + ", stuSubject="
				+ stuSubject + "]";
	}

	@Override
	public int compareTo(Students s) {
		// TODO Auto-generated method stub
		return this.stuId.compareTo(s.stuId);
	}
}
