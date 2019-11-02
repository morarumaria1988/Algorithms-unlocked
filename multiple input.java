import java.util.*;

/*Please dont change class name and class must not be public*/

class Dcoder{
	public static void main(String args[]){
		int side1, side2, area;
		//Taking user inputs
		Scanner scn = new Scanner(System.in);
		side1 = scn.nextInt();
		side2 = scn.nextInt();
		//Computing the area of the rectangle
		area = side1*side2;
		//Printing the area of the rectangle
		System.out.println("The area of the rectangle is : "+ area);
	}
}
