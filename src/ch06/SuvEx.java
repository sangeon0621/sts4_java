package ch06;

public class SuvEx {

	public static void main(String[] args) {

		Suv suv = new Suv();
		
		System.out.println(suv.color);
		System.out.println(suv.company);
		System.out.println(suv.engine);
		System.out.println(suv.name);
		
		suv.left();
		suv.right();
		int result = suv.sum(6, 2);
		System.out.println(result);
		
		
	}

}
