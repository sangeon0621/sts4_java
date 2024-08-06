package ch06.second;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		
		Arithmetic arithmetic = new Arithmetic();
		
		int result = arithmetic.sum(6,2);
		System.out.println(result);
		
		int result2 = arithmetic.sum2(10, 5);
		System.out.println(result2);
		
		int result3 = arithmetic.sum3(4, 3);
		System.out.println(result3);
		
		int result4 = arithmetic.sum4(result3, result2);
		System.out.println(result4);
		
		int result5 = arithmetic.sum5(result3, result4);
		System.out.println(result5);
	}

}
