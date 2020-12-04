package employee;

import medical.Medical;

public class PermanentTechnicalAssociate extends TechnicalAssociate implements Medical{
	
	private int experienceYear;
	private int numberCertificates;

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return experienceYear*5000 + numberCertificates*1000;
	}

	@Override
	public int medicalCoverage() {
		// TODO Auto-generated method stub
		return salary()*2;
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

	/**
	 * @return the numberCertificates
	 */
	public int getNumberCertificates() {
		return numberCertificates;
	}

	/**
	 * @param numberCertificates the numberCertificates to set
	 */
	public void setNumberCertificates(int numberCertificates) {
		this.numberCertificates = numberCertificates;
	}

	public PermanentTechnicalAssociate(int experienceYear, int numberCertificates) {
		super();
		this.experienceYear = experienceYear;
		this.numberCertificates = numberCertificates;
	}

	
}
