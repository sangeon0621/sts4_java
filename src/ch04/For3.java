package ch04;

public class For3 {

	public static void main(String[] args) {

//		1. (10 * 5)
//		**********
//		**********
//		**********
//		**********
//		**********
		
		
		String star = "";
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				star += "*";
			}
			System.out.println(star);
			star = "";
		}
		System.out.println("-------------");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i == 1 || i == 5) {
					star += "*";
				} else {
					if(j == 1 || j == 10) {
						star += "*";
					} else {
						star += " ";
					}
				}
			}
			System.out.println(star);
			star = "";
		}
		System.out.println("-------------");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == 10) {
					if(j % 2 == 1) {
						System.out.print(j);
					} else if(j == 10) {
						System.out.print("0");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		
	}

}
