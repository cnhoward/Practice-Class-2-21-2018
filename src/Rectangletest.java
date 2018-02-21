import java.util.Scanner;
public class Rectangletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		for (i = 1; i < 4; i ++){
	
		
	System.out.println("Enter the length and width of the rectangle");
	int num = scanner.nextInt();	 
	int num2 = scanner.nextInt();
	
	Rectangle r1 = new Rectangle (num, num2);
	
	System.out.println("The area is " + r1.getArea());
	System.out.println("The perimeter is " + r1.getPerimeter());
	
		} 
	}

}
