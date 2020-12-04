package employee;

import medical.Medical;

public class Manager implements Employees, Medical{

	private int experienceYear;
	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return experienceYear*10000;
	}

	@Override
	public int medicalCoverage() {
		// TODO Auto-generated method stub
		return salary();
	}

	/**
	 * @return the experienceYear
	 */
	public int getExperienceYear() {
		return experienceYear;
	}

	/**
	 * @param experienceYear the experienceYear to set
	 */
	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public Manager(int experienceYear) {
		super();
		this.experienceYear = experienceYear;
	}

}
