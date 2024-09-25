package test;

public class ComputerExample {

	public static void main(String[] args) {
		
		Constants constants = new Constants();
		System.out.println("원의 반지름: " + constants.PAI_1);
		
		Calculator calculator = new Calculator();
		System.out.println("Calculator 객체의 원면적: " + calculator.param());
		
		Computer computer = new Computer();
		System.out.println("Computer 객체의 원면적: " + computer.param());
		
	}

}
