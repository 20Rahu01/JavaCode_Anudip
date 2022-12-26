package Day8_21_12;

public class ClassWork1 {

	public static void main(String[] args) {
		int a=20,b=50,c=500;
		//external if
		if(a>b) {  // 20>50f
			//internal if
			if(a>c)
				System.out.println("a is grater");
			else
				System.out.println("c is grater");
		}
		else {
			if(b>c)
				System.out.println("b is grater");
			else
				System.out.println("c is grater");
		}
        
	}
}
