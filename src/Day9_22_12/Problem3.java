package Day9_22_12;

import java.util.Scanner;

public class Problem3 {

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n =sc.nextInt();
	    int product=1;
	    for(int i=1;i<=10;i++) {
	    	product=i*n;
	    	System.out.println(i+" X "+n+" = "+product);
	    }
	}
}
