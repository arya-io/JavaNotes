/*
1. Create a class with a method that prints "This is parent class" and its subclass
with another method that prints "This is child class". Now, create an object for
each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
*/

public class Main1 {
	
	public static void main(String [] args) {
		
		Parent1 parentObj = new Parent1();
		Child1 childObj = new Child1();
		
		parentObj.showParent();
		childObj.showChild();
		childObj.showParent();
	}

}
