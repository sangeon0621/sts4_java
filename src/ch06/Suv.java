package ch06;

public class Suv {
	
	int engine = 6;
	String name = "QM3";
	String company = "삼성";
	String color = "블랙";
	
	void left() {
		System.out.println("좌회전");
	}
	
	void right() {
		System.out.println("우회전");
	}
	
//	int result = sum(6, 2);
//	void result() {
//		System.out.println();
//	}
	
	int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	String sum2(String position) {
		switch(position) {
		case "사장": {
			return "100억";
		}
		case "부장": {
			return "10억";
		}
		case "과장": {
			return "1억";
		}
		case "대리": {
			return "9000만원";
		}
		case "사원": {
			return "8000만원";
		}
		case "나": {
			return "5000만원";
		}
		default: 
			return position;

		}
	}
	
	
	
}
