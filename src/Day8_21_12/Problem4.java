package Day8_21_12;

import java.util.Scanner;

public class Problem4 {

	public static void main(String []args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
	    int a=sc.nextInt();
        if(a%4 == 0 && a%11 == 0)
            System.out.print(a + " is divisible by both 4 & 11 ");
        else
        	System.out.print(a + " is not divisible by both 4 & 11 ");
        
    }
}
