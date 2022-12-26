package Day6_19_12;

public class Swapping {

	public static void main(String[] args)
	{
		int a=40,b=60,temp;
		System.out.println("Before swapping,the values are: a="+ a +" b=" + b);
		temp=a;  //temp=10
		a=b; //a=20
		b=temp; //b=10
		System.out.println("Using 3rd variable-->");
		System.out.println("After swapping,the values are: a="+a+" b="+b);
		temp=b;
		b=a;
		a=temp;
		System.out.println("Not using 3rd variable-->");
		System.out.println("After swapping,the values are: a="+a+" b="+b);
	}
}
