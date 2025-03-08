
public class Assignment9 {

	public static void main(String[] args) {

		int array[] = { 20, 30, 40 };

		int start = 0, end = array.length - 1, tmp;
		tmp = array[start];
		array[start] = array[end];
		array[end] = tmp;

		System.out.println("New array after swapping the first and last elements:");

		for (tmp = 0; tmp < array.length; tmp++) {
			System.out.print(array[tmp] + " ");
		}

	}

}
