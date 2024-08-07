package ch06.ninth;

public class MeberEx {

	public static void main(String[] args) {

		Member member = new Member();
		
//		member.name = "Tony";
		
		member.setName("Leo");
		
//		member.age = 28;
		member.setAge(25);
		
		System.out.println("member.name:" + member.getName());
		System.out.println("member.age:" + member.getAge());
		
		
	}

}
