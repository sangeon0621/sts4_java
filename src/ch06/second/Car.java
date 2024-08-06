package ch06.second;

public class Car {
	
	int engine;
	String name;
	String color;
	String company;
	
	Car() {
		
	}
	
	Car(String color) {
		this.color = color;
	}
	
	Car(int engine, String name, String color, String company) {
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
}
