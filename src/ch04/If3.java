package ch04;

public class If3 {

	public static void main(String[] args) {

//		int 타입의 변수를 1개 선언하고
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요
		
		int num = 4;
		
		if(num == 0) {
			System.out.println(num + "은/는 홀수도 짝수도 아니다.");
		} else if(num < 0) {
			System.out.println(num + "은/는 음수이다");
		} else if(num % 2 == 0) {
			System.out.println(num + "은/는 짝수이다");
		} else if(num % 2 == 1) {
			System.out.println(num + "은/는 홀수이다");
		} else {
			System.out.println(num + "은/는 실수이다");
		}
		
		
	}

}
