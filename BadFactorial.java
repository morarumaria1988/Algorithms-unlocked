package algoritmi;

import java.util.Scanner;

public class BadFactorial {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter an integer n > 0");
	    int n = myObj.nextInt(); 
	    myObj.close() ;
	    BadFactorial bf = new BadFactorial();
	    if (n < 0)
	    	System.out.println(n +" is a negative integer");
	    else System.out.println(bf.badFactorial(n));
	}
	
	int badFactorial (int n) {
		do {
		if (n == 0) 
		return 1;
		else return badFactorial (n+1)/(n+1);}
		while (n > 0);
	}

}
