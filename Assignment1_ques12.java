
public class Assignment1_ques12 {
	public static void main(String args[]) {
		int array1[] = { 1, 2, 3, 4, 5, 7 };
		int array2[] = { 2, 5, 7, 8, 0, 7 };
		int result[] = new int[array1.length + array2.length];
		for (int tmp = 0; tmp < array1.length; tmp++) {
			result[tmp] = array1[tmp];

		}
		for (int tmp = array1.length; tmp < result.length; tmp++) {
			result[tmp] = array2[tmp - array1.length];

		}

		for (int tmp = 0; tmp < result.length; tmp++) {
			for (int tmp1 = tmp + 1; tmp1 < result.length; tmp1++) {

				if (result[tmp1] < result[tmp]) {
					int s = result[tmp];
					result[tmp] = result[tmp1];
					result[tmp1] = s;
				}
			}
			System.out.print(result[tmp] + " ");
		}
	}
}
