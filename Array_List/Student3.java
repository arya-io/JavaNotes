package containerCodes;

public class Student3 implements Comparable<Student3> {

	int rollNo;
	String name;

	public Student3(int rollNo, String name) {

		super();
		this.rollNo = rollNo;
		this.name = name;

	}

	@Override
	public String toString() {

		return "Student [rollNo = " + rollNo + ", name = " + name + "]";
	}

	@Override
	public int compareTo(Student3 o) {

		return name.compareTo(o.name);
	}

}
