package profiles;

public class Manager extends Employee {

	protected float hra;

	public Manager(String name, String address, int age, char gender, float basicSalary, float hra) {
		super(name, address, age, gender, basicSalary);
		
		this.hra = hra;
	}
	
	@Override
	public String display() {
		
		String baseData = super.display();
		
		StringBuffer data = new StringBuffer(baseData);
		data.append("\nHRA: ");
		data.append(hra);
		return data.toString();
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}	

}
