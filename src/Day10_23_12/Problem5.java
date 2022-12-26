package Day10_23_12;

import java.util.Scanner;

public class Problem5 {

	public static void main(String []args){
		
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    n =sc.nextInt();
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println(n+" is a Perfct number");
		else
			System.out.println(n+" is not a Perfct number");
	}
}


