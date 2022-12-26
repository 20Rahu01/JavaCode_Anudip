package Day8_21_12;

import java.util.Scanner;

public class Problem3 {

	public static void main(String []args)
    {
		Scanner input =new Scanner(System.in);
		char ch = input.next().charAt(0);
          
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.print(ch + " is a vowel ");
       
       else
            System.out.print(ch + " is a consonant ");
      
    }   
}
