package Day9_22_12;

import java.util.Scanner;
// 3.write a program to find out sum of all odd number from 1 to n.
public class Problem4 {

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n =sc.nextInt();
	    int sum=0;
	   
	    for(int i=1;i<=n;i+=2) {
	    	//if(i%2==1)
	    		sum+=i;
	    }
	    System.out.println("Total Sum: " + sum);
	   
	}
}
