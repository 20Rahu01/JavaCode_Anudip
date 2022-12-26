package Day6_19_12;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		float a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
        a=sc.nextFloat();
        System.out.println("Enter 2nd number:");
        b=sc.nextFloat();
        if(a<b) {
        	System.out.println("Minimum : "+ a);
        	System.out.println("Maximum : "+ b);
        }
        else {
        	System.out.println("Minimum : "+ b);
        	System.out.println("Maximum : "+ a);
        }
        	
	}
}
