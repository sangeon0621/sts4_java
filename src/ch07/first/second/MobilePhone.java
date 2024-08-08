package ch07.first.second;

public class MobilePhone extends Phone {

	@Override
	void call() {
		System.out.println("전화걸기.MobilePhone");
	}

	@Override
	void callon() {
		System.out.println("전화받기.MobilePhone");
	}

	@Override
	void link() {
		System.out.println("무선 기지국 연결.MobilePhone");
	}

	@Override
	void power() {
		System.out.println("배터리 충전하기.MobilePhone");
	}

	
	
	
}
