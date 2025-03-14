
public class Complex4 {

	int real, imaginary, real2, imaginary2;

	Complex4(int r, int i, int r2, int i2) {
		real = r;
		imaginary = i;
		real2 = r2;
		imaginary2 = i2;
	}

	public void Add() {

		System.out.println(real + real2 + " + " + (imaginary + imaginary2) + "i");
	}

	public void Difference() {

		System.out.println((real - real2) + " + " + (imaginary - imaginary2) + "i");
	}

	public void Product() {

		System.out.println(real * real2 + " + " + imaginary * imaginary2 + "i");
	}

}
