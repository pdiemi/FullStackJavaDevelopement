package employee;

public class ContractTechnicalAssociate extends TechnicalAssociate{
	
	private int wage;
	private int hours;

	@Override
	public int salary() {
		if (hours <= 40) {
			return wage*hours;
		}
		else {
			return wage*hours + (hours-40)*wage*2;
		}
	}

	/**
	 * @return the wage
	 */
	public int getWage() {
		return wage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setWage(int wage) {
		this.wage = wage;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	public ContractTechnicalAssociate(int wage, int hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}
	

}
