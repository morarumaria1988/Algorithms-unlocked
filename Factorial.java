package algoritmi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter an integer n > 0");
	    int n = myObj.nextInt(); 
	    myObj.close() ;
	    Factorial f = new Factorial();
	    if (n < 0)
	    	System.out.println(n +" is a negative integer");
	    else System.out.println(f.factorial(n));
	}
	
	int factorial (int n) {
		do {
		if (n == 0) 
		return 1;
		else return n* factorial (n-1);}
		while (n > 0);
	}

}
