

/*
6.Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:
Sum of the first 100 prime numbers: 24133
*/

public class Assignment6 {

	public static void main(String[] args) {

		int count = 1, sum = 2;
		int Num = 3;
		boolean flag;

		while (true) {
			
			flag = true;

			for (int start = 2; start < Num; start++) {
				if (Num % start == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				sum += Num;
				count++;
			}
			Num++;
			if (count == 100)
				break;
		}
		
		System.out.println("Sum of the first 100 prime numbers: " + sum);
	}
}
