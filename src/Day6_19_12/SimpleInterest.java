package Day6_19_12;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float amount,rate_of_interest,year,SI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of amount: ");
        amount = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        rate_of_interest = sc.nextFloat();
        System.out.println("Enter year: ");
        year = sc.nextFloat();
        SI=(amount*rate_of_interest*year)/100;
        System.out.println("Area of Recrangle: "+ SI);
	}
}
