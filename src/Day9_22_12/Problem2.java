package Day9_22_12;

import java.util.Scanner;

public class Problem2 {

	public static void main(String []args){
		//taking value from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n =sc.nextInt();
	    int product=1;
	    for(int i=1;i<=n;i++) {
	    	product*=i;
	    }
	    System.out.println("Total Product: " + product);
	    
	}
}
