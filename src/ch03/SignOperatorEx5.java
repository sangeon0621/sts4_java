package ch03;

public class SignOperatorEx5 {

	public static void main(String[] args) {

//		논리연산자 (&, &&, |, ||, ^)
		
		int a = 65;
		
		if(a >= 65 && a <= 70) {
			System.out.println("&&: True");
		}
		
		if(a >= 65 & a <= 70) {
			System.out.println("&: True");
		}
		
		if(a > 65 || a <= 70) {
			System.out.println("||: True");
		}
		
		if(a > 65 | a <= 70) {
			System.out.println("|: True");
		}
		
		if(a > 65 ^ a <= 70) {
			System.out.println("^: True");
		}
		
	}

}
