package Day10_23_12;

import java.util.Scanner;

public class Counting {

	public static void main(String []args){
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    n =sc.nextInt();
	    
	    for(;n!=0;n/=10) 
	    	count+=1;
	    	
	    System.out.println("Total count: "+count);
	    
	}
}
