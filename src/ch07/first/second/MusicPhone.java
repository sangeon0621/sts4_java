package ch07.first.second;

public class MusicPhone extends Phone {

	@Override
	void call() {
		System.out.println("전화걸기.MusicPhone");
	}

	@Override
	void callon() {
		System.out.println("전화받기.MusicPhone");
	}

	@Override
	void link() {
		System.out.println("무선 기지국 연결.MusicPhone");
	}

	@Override
	void power() {
		System.out.println("배터리 충전하기.MusicPhone");
	}
	
	
	void musicDown() {
		System.out.println("음악 다운받기");
	}
	
	void playMusic() {
		System.out.println("음악 재생하기");
	}
	
}
