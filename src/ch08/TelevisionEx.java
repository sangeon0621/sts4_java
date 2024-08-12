package ch08;

public class TelevisionEx {

	public static void main(String[] args) {
		
//		인터페이스 객체 생성 불가
//		RemoteControl remotecontrol = new RemoteControl();
		
//		Television television = new Television();
		
//		television.turnOn();
		
//		SettopBox settopbox = new SettopBox();
//		
//		settopbox.turnOn();
		
		RemoteControl remotecontrol = new SettopBox();
		
		remotecontrol.turnOn();
		remotecontrol.turnOff();
		
		
	}

}
