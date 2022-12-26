package Day10_23_12;

import java.util.Scanner;

//1.write a program to find out first and last digit of a number.
//Ex.1234  first digit:1  last digit:4
public class Problem3 {

	public static void main(String []args){
		int n,rev=0,rem,temp,fDigit,lDigit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    n =sc.nextInt();
	    temp=n;
	    lDigit=n%10;
	    for(;n>0;) {
	    	rem=n%10;
	    	rev=rev*10+rem;
	    	n=n/10;
	    }
	    fDigit=rev%10;
	    System.out.println("First Digit: "+fDigit+" and Last Digit: "+lDigit);
	    

	}
}
