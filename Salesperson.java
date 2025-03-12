package profiles;

public class Salesperson extends Employee {

	protected float commission;

	public Salesperson(String name, String address, int age, char gender, float basicSalary, float commission) {
		super(name, address, age, gender, basicSalary);

		this.commission = commission;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

}
