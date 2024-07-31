package ch04;

public class For2 {

	public static void main(String[] args) {

//		1부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지 더한 값 :" +sum);
		
		System.out.println("--------------");
		
		
//		11 ~ 50까지 짝수의 합을 구하시오
		
		int result = 0;
		for(int i = 11; i <= 50; i++) {
			if(i % 2 == 0) {
				result += i;
			}
		} //for end
		System.out.println("11 ~ 50까지 짝수의 합 :" + result);
		
	}

}
