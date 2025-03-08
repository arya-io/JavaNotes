
public class Assignment8 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60 };

		int start = 0, end = array.length - 1, tmp;

		while (start < end) {
			tmp = array[start];
			array[start] = array[end];
			array[end] = tmp;
			start++;
			end--;
		}

		for (tmp = 0; tmp < array.length; tmp++) {
			System.out.print(array[tmp] + " ");

		}

	}

}
