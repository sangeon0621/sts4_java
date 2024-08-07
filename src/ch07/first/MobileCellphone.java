package ch07.first;

public class MobileCellphone {

	public static void main(String[] args) {

		Cellphone cellphone = new Cellphone();
		
		cellphone.powerOn();
		
		DmbCellphone dmbcellphone = new DmbCellphone();
		
		dmbcellphone.turnOffDmb();
		
		dmbcellphone.powerOn();
		
		
	}

}
