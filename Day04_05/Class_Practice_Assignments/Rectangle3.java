
public class Rectangle3 {
	
	int length, breadth;
	
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	
	public int area(){
		
		return (length * breadth);
	}
	
	public void showArea() {
		
		System.out.println("\nLength: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area: " + area());
	}
}
