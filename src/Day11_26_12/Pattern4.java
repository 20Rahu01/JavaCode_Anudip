package Day11_26_12;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int row =sc.nextInt();
	    //----------------------------------------
	    for (int i=0; i<row; i++) {  
	        
	    for (int j=row-i; j>1; j--)   //inner loop work for space  
	    	System.out.print(" ");   

	    for (int k=0; k<=i; k++ )  //prints star       
	    	System.out.print("* ");   
	      
	    System.out.println();   
	    }   
	    //-----------------------------------------
	    int row1 = row/2;
	    if(row%2==0) {
	    	for (int i=0; i<row1; i++) {
		    	for (int j=1; j<=row1; j++) 
		    		System.out.print(" ");  // giving spaces
		    	
			    for (int j=row1-i; j>1; j--)   //inner loop work for space  
			    	System.out.print(" ");   
		
			    for (int k=0; k<=i; k++ )  //prints star       
			    	System.out.print("* ");   
			      
			    System.out.println();   
		    } 
	    }
	    else {
	    	for (int i=0; i<row1; i++) {
		    	for (int j=1; j<=row1+1; j++) 
		    		System.out.print(" ");  // giving spaces
		    	
			    for (int j=row1-i; j>1; j--)   //inner loop work for space  
			    	System.out.print(" ");   
		
			    for (int k=0; k<=i; k++ )  //prints star       
			    	System.out.print("* ");   
			      
			    System.out.println();   
		    } 
	    }
	     
	    //-----------------------------------------
	    
	    int row2;
	    if(row<5) {
	    	row2 = 1;
	    	for (int i=1; i<=row/2; i++) {  
		    	
		    	for (int j=1; j<=row-2; j++) 
		    		System.out.print(" ");
		        
			    for (int j=1; j<=row2; j++)   //inner loop work for space  
			    	System.out.print("* ");
			    
			    System.out.println(); 
		    }
	    }
	    else {
	    	row2 = 2;
	    	for (int i=1; i<=row/2; i++) {  
		    	
		    	for (int j=1; j<=row-2; j++) 
		    		System.out.print(" ");
		        
			    for (int j=1; j<=row2; j++)   //inner loop work for space  
			    	System.out.print("* ");
			    
			    System.out.println(); 
		    }

	    }

    }
	    	    
	    
	    
}

