package Day6_19_12;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		float length,width,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
        length=sc.nextFloat();
        System.out.println("Enter width of rectangle:");
        width=sc.nextFloat();
        perimeter=2*(length+width);
        System.out.println("Area of Recrangle: "+ perimeter);
	}
}
