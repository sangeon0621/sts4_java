package ch04;

public class If5 {

	public static void main(String[] args) {

//		int 타입의 변수를 3개 선언하고
//		세 정수중에서 최대값, 최소값을 구하는 프로그램을 작성하시오
		
		int a = 10;
		int b = 10;
		int c = 10;
		
//		if(num1 > num2 && num1 > num3) {
//			if(num2 < num3) {
//				System.out.println("최대값은 :" + num1);
//				System.out.println("최소값은 :" + num2);
//			} else if(num2 > num3) {
//				System.out.println("최대값은 :" + num1);
//				System.out.println("최소값은 :" + num3);
//			} else {
//				System.out.println("최대값은 :" + num1);
//				System.out.println("최소값은 num2 :" + num2 + "과 num3 :" + num3);
//			} // else end
//		} else if(num1 < num2 && num2 > num3) {
//			if(num1 < num3) {
//				System.out.println("최대값은 :" + num2);
//				System.out.println("최소값은 :" + num1);
//			} else if(num1 > num3) {
//				System.out.println("최대값은 :" + num2);
//				System.out.println("최소값은 :" + num3);
//			} else {
//				System.out.println("최대값은 :" + num2);
//				System.out.println("최소값은 num1 :" + num1 + "과 num3 :" + num3);
//			} // else end
//		} else if(num3 > num1 && num3 > num2) {
//			if(num1 < num2) {
//				System.out.println("최대값은 :" + num3);
//				System.out.println("최소값은 :" + num1);
//			} else if(num1 > num2) {
//				System.out.println("최대값은 :" + num3);
//				System.out.println("최소값은 :" + num2);
//			} else {
//				System.out.println("최대값은 :" + num3);
//				System.out.println("최소값은 num1 :" + num1 + "과 num2 :" + num2);
//			} // else end
//		} else {
//			System.out.println("모든 값이 똑같다");
//		} // else end
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 : " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 : " + b);
			} else {
				System.out.println("최대값은 : " + c);
			}
			
			if(a < b && a < c) {
				System.out.println("최소값은 : " + a);
			} else if ( b < a && b < c ) {
				System.out.println("최소값은 : " + b);
			} else {
				System.out.println("최소값은 : " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
		
		
	}

}
