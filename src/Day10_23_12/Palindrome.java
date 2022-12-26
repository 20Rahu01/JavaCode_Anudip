package Day10_23_12;

import java.util.Scanner;

public class Palindrome {

	public static void main(String []args){
		int n,rev=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to count:");
	    n =sc.nextInt();
	    temp=n;
	    
	    for(;n>0;) {
	    	rem=n%10;
	    	rev=rev*10+rem;
	    	n=n/10;
	    }
	    System.out.println("Revrese of "+temp+ " is: "+rev);
	    
	    if(temp==rev) 
	    	System.out.println(temp+" is Palindrome");
	    else
	    	System.out.println(temp+" is not Palindrome");
	    
	}
	
		
}
