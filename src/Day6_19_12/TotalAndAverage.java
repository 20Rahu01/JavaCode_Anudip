package Day6_19_12;

import java.util.Scanner;

public class TotalAndAverage {

	public static void main(String[] args) {
		float s1,s2,s3,s4,s5,sum,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st subject marks:");
        s1=sc.nextFloat();
        System.out.println("Enter 2nd subject marks:");
        s2=sc.nextFloat();
        System.out.println("Enter 3rd subject marks:");
        s3=sc.nextFloat();
        System.out.println("Enter 4th subject marks:");
        s4=sc.nextFloat();
        System.out.println("Enter 5th subject marks:");
        s5=sc.nextFloat();
       
        sum=s1+s2+s3+s4+s5;
        avg= sum/5;
        System.out.println("Sum of all subjects: "+ sum);
        System.out.println("Average of all subjects: "+ avg);
	}

}
