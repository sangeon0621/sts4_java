package ch13.first;

public class BoxEx {

	public static void main(String[] args) {
		
//		Box box = new Box();
		
//		box.setA("asdasdsad");
//		box.setA(10);
		
		Box<String> box = new Box<>();
		box.setT("asdasdsad");
		System.out.println(box.getT());
		
		System.out.println("------------------------");
		
		Box<Integer> box2 = new Box<>();
		
		box2.setT(10);
		System.out.println(box2.getT());
		
		
	}

}
