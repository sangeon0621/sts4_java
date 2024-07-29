package ch03;

public class SignOperatorEx2 {

	public static void main(String[] args) {

//		증감 연산자
		
		int i = 7;
		int j = 8;
		
		i++;
		++j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("-------------");
		
		int k = i++;
		int m = ++j;
		
		System.out.println("k :" + k);
		System.out.println("i :" + i);
		System.out.println("m :" + m);
		System.out.println("j :" + j);
		
	}

}
