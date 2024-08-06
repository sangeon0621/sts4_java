package ch06.second;

public class IphoneEx {

	public static void main(String[] args) {
		
		
		Iphone iphone = new Iphone("i3");
		System.out.println("iphone.cpu:" + iphone.cpu);
		
		System.out.println("-------------------");
		
		Iphone iphone2 = new Iphone("i5", "8GB");
		System.out.println("iphone2.cpu:" + iphone2.cpu);
		System.out.println("iphone2.memory:" + iphone2.memory);
		
		System.out.println("-------------------");
		
		Iphone iphone3 = new Iphone("i7", "16GB", "Black");
		System.out.println("iphone3.cpu:" + iphone3.cpu);
		System.out.println("iphone3.memory:" + iphone3.memory);
		System.out.println("iphone3.color:" + iphone3.color);
		
		System.out.println("-------------------");
		
		iphone3.color = "White";
		System.out.println("iphone3.color:" + iphone3.color);
		
		
		
	}

}
