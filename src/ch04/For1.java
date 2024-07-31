package ch04;

public class For1 {

	public static void main(String[] args) {

//		2단 부터 출력 되는 구구단 프로그램을 작성하시오.
//		긱 단계 마다 구분선을 넣어 주세요.
//		2 * 1 = 2
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
			if(i != 9) {
				System.out.println("-----------------");
			} else {
				
			} // if end
		}
		
	}

}
