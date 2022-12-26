package Day11_26_12;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String []args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    n =sc.nextInt();
        for(int i=1;i<=n;i++) { //for row  
        	
        	for(int j=n;j>i;j--) //for space
        		System.out.print("  ");
        	
        	for(int k=1;k<=i;k++) //for column
        		System.out.print("* ");
        	
        	System.out.println(""); // printing new line
    
	    }
	}

}
