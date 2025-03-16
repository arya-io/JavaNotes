package containerCodes;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student3> {

	int order;
	int field;

	public StudentComparator(int order, int field) {
		super();
		this.order = order;
		this.field = field;
	}

	@Override
	public int compare(Student3 o1, Student3 o2) {

		if (order == 1) {

			if (field == 1) {

				if (o1.rollNo < o2.rollNo)
					return -1;
				else if (o1.rollNo > o2.rollNo)
					return 1;
				else
					return 0;
			} else
				return o1.name.compareTo(o2.name);
		} else {

			if (field == 1) {

				if (o1.rollNo < o2.rollNo)
					return 1;
				else if (o1.rollNo > o2.rollNo)
					return -1;
				else
					return 0;
			}
		}

		return 0;
	}

}
