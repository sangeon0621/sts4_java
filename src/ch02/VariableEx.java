package ch02;

public class VariableEx {
	
//	상수 표기법
	static final int SOCIAL_SECURITY_NUMBER = 11111;
	
//	스네이크 표기법
	int social_security_number;
	
//	파스칼 표기법
	int SocialSecurityNunber;
	
//	카멜 표기법
	int socialSecurityNunber;
	
	
	public static void main(String[] args) {

		int number = 1;
		int Number = 2;
		
		System.out.println(number + " : " + Number);
		
//		--------------
		
		int a;
		int b = 1;
		
		int c = 0;
		
//		c = a + b; 
		
//		변수는 선언된 블럭 내에서만 사용 가능하다.
		int d= 1;
		
		if(d == 1) {
			int aaa = 10;
			int bbb = aaa + d;
			System.out.println(bbb);
		} else {
			
		}
		
		
	}

}
