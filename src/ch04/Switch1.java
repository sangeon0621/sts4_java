package ch04;

public class Switch1 {

	public static void main(String[] args) {

		int num = 7;
		
		switch (num) {
		case 1: {
			System.out.println(num + "번입니다");
			break;
		}
		case 2: {
			System.out.println(num + "번입니다");
			break;
		}	
		case 3: {
			System.out.println(num + "번입니다");
			break;
		}
		case 4: {
			System.out.println(num + "번입니다");
			break;
		}
		default:
			System.out.println("1 ~ 4 까지만 가능");
			break;
		}
		
		
		
	}

}
