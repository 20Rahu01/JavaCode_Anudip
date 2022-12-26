package Day8_21_12;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {

		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
	    a=sc.nextInt();
	    if(a>=0)
	    	System.out.println(a+" is positive");
	    else
	    	System.out.println(a+" is negative");

	}
}
