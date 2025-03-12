package profiles;

public class Engineer extends Employee {

	protected int overTime;

	public Engineer(String name, String address, int age, char gender, float basicSalary, int overTime) {
		super(name, address, age, gender, basicSalary);
		
		this.overTime = overTime;
	}

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}	

}
