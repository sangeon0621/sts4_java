package ch07.first.fifth;

public abstract class Phone {
//	public String owner;
	
//	public Phone(String owner) {
//		this.ower = ower;
//	}
	
	public void turnon() {
		System.out.println("turnon");
	}
	
	public void turnoff() {
		System.out.println("turnoff");
	}
	
	public abstract void open();
	
	
}
