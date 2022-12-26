package Day8_21_12;

import java.util.Scanner;

public class Problem5 {

	public static void main(String []args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cost Price:");
	    int costPrice =sc.nextInt();
	    System.out.println("Enter Selling Price:");
	    int sellPrice =sc.nextInt();
	    
	    System.out.println("Entered Selling Price: " + sellPrice);
	    System.out.println("Entered Cost Price: "+ costPrice);
	    
        if(costPrice < sellPrice) {
        	int profit= sellPrice-costPrice;
            System.out.println(profit + "Rs is the total profit, enjoy!!");
        }
        else {
        	int loss = costPrice-sellPrice; 
        	System.out.print("Unfortunately "+ loss + "Rs is the total loss");
        }
        
    }
}
