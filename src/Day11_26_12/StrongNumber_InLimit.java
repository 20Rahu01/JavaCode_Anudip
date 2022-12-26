package Day11_26_12;

public class StrongNumber_InLimit {

	public static void main(String []args){
		
		int rem,fact,i,sum=0;
		for(int j=1;j<=5000;j++) {
	    	int num=j;
	    	for(;num>0;) //145>0 -- 14>0  --  1>0
		    {
		        rem=num%10;
		        fact=1;
		        for(i=1;i<=rem;i++){
		            fact *= i;
		        }
		       
		        sum+=fact;
		        num=num/10;
		    }
		    if (sum == j) 
		        System.out.println(j + " is STRONG NUMBER");    
		}
	}
}
