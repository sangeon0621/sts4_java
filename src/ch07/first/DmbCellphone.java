package ch07.first;

public class DmbCellphone extends Cellphone {

//	child class
	
//	필드
	public int channel;
	
//	메소드
	void turnOnDmb() {
//		poweOn();
		System.out.println("채널" + channel + "번 DMB");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}
	@Override
	void powerOn() {
		System.out.println("컴퓨터 전원을 킵니다.");
	}
	
	
	
}
