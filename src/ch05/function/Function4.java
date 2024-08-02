package ch05.function;

public class Function4 {

	public static void main(String[] args) {

		
//		정수
//		100 이내의 자연수에서 선택된 수만큼 합산
		
		int result = sum(4);
		System.out.println(result);
		
	}
	
	public static int sum(int a) {
		int result = a;
		int result2 = 0;
		if(result <= 100 && result >= 1) {
			for(int i = 1; i <= result; i++) {
				result2 += i;
			}
		} else {
//			by pass
		}
		return result2;
		
	}

}
