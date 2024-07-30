package ch04;

public class If2 {

	public static void main(String[] args) {

//		일반 : 1, 5% 할인적용
//		브론즈 : 2, 10% 할인적용
//		실버 : 3, 15% 할인적용
//		골드 : 4, 20% 할인적용
//		플래티넘 : 5, 25% 할인적용
		
		int grade = 5;
		int cost = 12000;
		
		double salesCost = 0.0;
		
		if(grade == 1) {
			salesCost = 0.05;
			double result1 = cost - cost * salesCost;
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는 :" + (int)result1 + "원 입니다." );
		} else if(grade == 2) {
			salesCost = 0.1;
			double result2 = cost - cost * salesCost;
			System.out.println("정가가" + cost + "원인 브론즈 등급의 할인가는 :" + (int)result2 + "원 입니다." );
		} else if(grade == 3) {
			salesCost = 0.15;
			double result3 = cost - cost * salesCost;
			System.out.println("정가가" + cost + "원인 실버 등급의 할인가는 :" + (int)result3 + "원 입니다." );
		} else if(grade == 4) {
			salesCost = 0.2;
			double result4 = cost - cost * salesCost;
			System.out.println("정가가" + cost + "원인 골드 등급의 할인가는 :" + (int)result4 + "원 입니다." );
		} else if(grade == 5) {
			salesCost = 0.25;
			double result5 = cost - cost * salesCost;
			System.out.println("정가가" + cost + "원인 플래티넘 등급의 할인가는 :" + (int)result5 + "원 입니다." );
		}
		
//		if(grade == 1) {
//			salesCost = cost * (1-0.05);
//			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 2) {
//			salesCost = cost * (1-0.1);
//			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 3) {
//			salesCost = cost * (1-0.15);
//			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 4) {
//			salesCost = cost * (1-0.2);
//			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if (grade == 5) {
//			salesCost = cost * (1-0.027);
//			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else {
//			System.out.println("1~5 까지의 grade 만 가능합니다.");
//		}
		
	}

}
