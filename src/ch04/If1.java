package ch04;

public class If1 {

	public static void main(String[] args) {

//		if - 학점 계산
//		A : 90 : 97 93
//		b : 89 ~ 80 
//		b : 79 ~ 70
//		b : 69 ~ 60
//		b : 59 ~ 0
		
		int score = 88;
		
//		if(score >= 90) {
//			System.out.println(score + "점은 A학점");
//		} else if(score >= 80) {
//			System.out.println(score + "점은 B학점");
//		} else if(score >= 70) {
//			System.out.println(score + "점은 C학점");
//		} else if(score >= 60) {
//			System.out.println(score + "점은 D학점");
//		} else {
//			System.out.println(score + "점은 F학점");
//		}
		
//		if(score >= 90) {
//			System.out.println(score + "점은 A학점");
//		} else if(score >= 80 && score < 90) {
//			System.out.println(score + "점은 B학점");
//		} else if(score >= 70 && score < 80) {
//			System.out.println(score + "점은 C학점");
//		} else if(score >= 60 || score + 10 <= 70) {
//			System.out.println(score + "점은 D학점");
//		} else {
//			System.out.println(score + "점은 F학점");
//		}
		
		if(score >= 90) {
			if(score <= 100 && score >=97) {
				System.out.println(score + "점은 A+학점");
			} else if(score <= 97 && score >= 93) {
				System.out.println(score + "점은 A학점");
			} else {
				System.out.println(score + "점은 A-학점");
			}
		} else if(score >= 80 && score < 90) {
			if(score < 90 && score >= 87) {
				System.out.println(score + "점은 B+학점");
			} else if(score < 87 && score >= 83) {
				System.out.println(score + "점은 B학점");
			} else {
				System.out.println(score + "점은 B-학점");
			}
		} else if(score >= 70 && score < 80) {
			System.out.println(score + "점은 C학점");
		} else if(score >= 60 || score + 10 <= 70) {
			System.out.println(score + "점은 D학점");
		} else {
			System.out.println(score + "점은 F학점");
		}
		
		
	}

}
