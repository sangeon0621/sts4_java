package ch05.function;

public class Function3 {

	public static void main(String[] args) {
		
		int result = sum(4,2,1);
		System.out.println(result);
	}
	
	public static int sum(int a, int b, int c) {
		int result = 0;
		if(a != b && a != c && b != c) {
			if(a < b && b > c) {
				result = b;
			} else if(a > b && a > c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			
		}
		return result;
	}
	

}
