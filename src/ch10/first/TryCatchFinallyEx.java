package ch10.first;

public class TryCatchFinallyEx {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("ExTry");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
