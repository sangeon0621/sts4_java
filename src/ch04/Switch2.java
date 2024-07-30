package ch04;

public class Switch2 {

	public static void main(String[] args) {
		
//		사장, 부장, 과장, 대리, 주임, 사원, 나
//		사장의 연봉은 얼마 입니다.
		
		String position = "사장";	
		
		switch(position) {
		case "사장": {
			System.out.println(position + "의 연봉은 9000입니다");
			break;
		}
		case "부장": {
			System.out.println(position + "의 연봉은 8000입니다");
			break;
		}
		case "과장": {
			System.out.println(position + "의 연봉은 7000입니다");
			break;
		}
		case "대리": {
			System.out.println(position + "의 연봉은 6000입니다");
			break;
		}
		case "주임": {
			System.out.println(position + "의 연봉은 5000입니다");
			break;
		}
		case "사원": {
			System.out.println(position + "의 연봉은 4000입니다");
			break;
		}
		case "나": {
			System.out.println(position + "의 연봉은 3000입니다");
			break;
		}
		default :
			System.out.println("직원만 입력가능");
			break;
		}
		
		
	}

}
