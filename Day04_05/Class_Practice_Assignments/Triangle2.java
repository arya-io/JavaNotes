
public class Triangle2 {

	int s1, s2, s3;

	Triangle2(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public int Perimeter() {

		return (this.s1 + this.s2 + this.s3);
	}

	public double Area() {

		int s = Perimeter() / 2;

		return (Math.sqrt(s * (s - this.s1) * (s - this.s2) * (s - this.s3)));
	}

}
