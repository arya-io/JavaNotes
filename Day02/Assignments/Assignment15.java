/*
15. Write a Java program to find the total number of occurrence of a specified value
in an array.
Test :
Array : [10,99,34,78,99,21,34,56,34,78]
Output : 10 appears 1
99 appears 2
34 appears 3 and so on.
*/

public class Assignment15 {
	
	public static void main(String [] args) {
		int hash [] = new int [101];
		int Arr [] = {10, 99, 34, 78, 99, 21, 34, 56, 34, 78};
		
		for(int temp = 0; temp < Arr.length; temp++) {
			hash[Arr[temp]]++;
		}
		
		for(int temp = 0; temp < 101; temp++) {
			if(hash[temp] != 0) {
				System.out.println(temp + " appears " + hash[temp]);
			}
		}
	}
}
