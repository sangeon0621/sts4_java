package ch07.first.third;

public class StudentEx {

	public static void main(String[] args) {

		Student student = new Student("이상언", "000621", 19);
		
		System.out.println(student.name);
		
		student.sayName();
		
	}

}
