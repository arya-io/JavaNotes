/*
4. Print the sum, difference and product of two complex numbers by creating a  class named 'Complex' with separate methods for each operation whose real and  imaginary parts are entered by user.
*/

public class Main4 {

	public static void main(String[] args) {

		int r1, i1, r2, i2;

		System.out.print("\nEnter real number 1: ");
		r1 = ConsoleInput.getInteger();

		System.out.print("\nEnter imaginary number 1: ");
		i1 = ConsoleInput.getInteger();

		System.out.print("\nEnter real number 2: ");
		r2 = ConsoleInput.getInteger();

		System.out.print("\nEnter imaginary number 2: ");
		i2 = ConsoleInput.getInteger();

		Complex4 c = new Complex4(r1, i1, r2, i2);

		System.out.println();

		c.Add();
		c.Difference();
		c.Product();
	}

}
