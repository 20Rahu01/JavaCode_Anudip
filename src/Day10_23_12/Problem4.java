package Day10_23_12;

import java.util.Scanner;

//2.find out a frequency of a particular digit in an integer.
//Ex: 12245  given number:2   frequencty:2 times

public class Problem4 {
	public static void main(String []args){
		int n,rem,count_number,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    n =sc.nextInt();
	    System.out.println("Enter a number to count:");
	    count_number =sc.nextInt();
	    
	    for(;n>0;) {
	    	rem=n%10;
	    	if(count_number==rem)
	    		count++;
	    	n=n/10;
	    }
	    
	    System.out.println("Total count: "+count);
	    
	}

}
