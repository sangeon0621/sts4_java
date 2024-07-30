package ch04;

public class If4 {

	public static void main(String[] args) {

//		int 타입의 변수를 2개 선언하고
//		두 정수 가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
		int x = 1;
		int y = 2;
		
		if(x == 0 && y == 0) {
			System.out.println("사분면에 해당하지 않는다.");
		} else if(x > 0 && y > 0) {
			System.out.println("(x, y) 는 1사분면에 위치합니다");
		} else if(x < 0 && y > 0) {
			System.out.println("(x, y)는 2사분면에 위치합니다");
		} else if(x < 0 && y < 0) {
			System.out.println("(x, y)는 3사분면에 위치합니다");
		} else if(x > 0 && y < 0) {
			System.out.println("(x, y)는 4사분면에 위치합니다");
		} else if(x == 0 && y != 0) {
			System.out.println("(x, y)는 x축에 위치합니다");
		} else {
			System.out.println("(x, y)는 y축에 위치합니다");
		}
		
	}

}
