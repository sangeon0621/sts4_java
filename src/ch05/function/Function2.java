package ch05.function;

public class Function2 {

	public static void main(String[] args) {

		
		String result = sum(3);
		System.out.println(result);
		
	}
	
	public static String sum(int a) {
		int num = a;
		String result;
		
		if(num == 0) {
			result = "0은 0이다";
//			return "0은 0이다";
		}  else if(num % 2 == 0) {
			result = "짝수";
//			return "짝수";
		} else {
			result = "홀수";
//			return "홀수";
		}
		return result;
	}

}
