package Day9_22_12;

import java.util.Scanner;

public class Problem1 {

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n =sc.nextInt();
	    int sum=0;
	    // method 1
	    for(int i=1;i<=n;i++) {
	    	sum+=i;
	    }
	    System.out.println("Total Sum: " + sum);
	    
	    // method 2
	    int sum2=n*(n+1)/2;
	    System.out.println("Total Sum: " + sum2);
	}
    
}
