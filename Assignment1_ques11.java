
public class Assignment1_ques11 
{
	public static void main(String args[])
	{
		System.out.print("Enter the total numbers you need to sort : ");
		int values = ConsoleInput.getInteger();
		int array[] = new int[values];

		for (int tmp = 0; tmp < array.length; tmp++) 
		{
			System.out.println("Enter the value : ");
			int val = ConsoleInput.getInteger();
			array[tmp] = val;
		}
		for (int tmp = 0; tmp < array.length; tmp++) 
		{
			System.out.print(array[tmp] + " ");
		}

		System.out.println(
				"\nHow do you want to arrange the array : \n1.Arrange in Ascending order \n2.Arrange in Descending order");
		int choice = ConsoleInput.getInteger();
		switch (choice) 
		{
		case 1: 
		{
			System.out.println("Ascending order: ");
			for (int tmp = 0; tmp < array.length; tmp++)
			{

				for (int tmp1 = tmp+1; tmp1 < array.length; tmp1++) 
				{

					if (array[tmp1] < array[tmp]) 
					{
						int s = array[tmp];
						array[tmp] = array[tmp1];
						array[tmp1] = s;
					}
				}
				System.out.print(array[tmp] + " ");
			}

		}
			break;
		case 2: 
		{
			System.out.println("Descending order: ");
			for (int tmp = 0; tmp < array.length; tmp++) 
			{
				for (int tmp1 = tmp + 1; tmp1 < array.length; tmp1++) 
				{
					
					if (array[tmp1] > array[tmp])
					{
					int	asc = array[tmp];
					array[tmp] = array[tmp1];
					array[tmp1] = asc;
					}
				}
				System.out.print(array[tmp] + " ");
			}
			
		}
			break;

		default: {
			System.out.println("Error : incorrect input ");
		}
			break;
		}
	}
}
