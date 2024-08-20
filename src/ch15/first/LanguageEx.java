package ch15.first;

import java.util.ArrayList;
import java.util.List;


public class LanguageEx {

	public static void main(String[] args) {

		Language language = new Language("Korean", 82);
		
		System.out.println(language.name);
		
//		ArrayList<Language> arraylist = new ArrayList<>();
		
		List<Language> list = new ArrayList<>();
		
//		list.add("asdsad"); //에러 language 객체 생성
		
		list.add(language);
		
		Language language2 = new Language("USA",10);
		Language language3 = new Language("Japan", 11);
		
		list.add(language2);
		list.add(language3);
		
		list.add(new Language("England", 15));
		
		Car car = new Car("Hyundai", 2000);
		
//		list.add(car); // error : language 객체만 담을 수 있다.
		
		List<Car> list2 = new ArrayList<>();
		
		list2.add(car);
		
//		--------------------
		
		for(int i = 0; i < list.size(); i++) {
//			System.out.println("i : " + i);
//			System.out.println(list.get(i));
			System.out.println("list.get("+ i + ").name: " + list.get(i).name);
		}

		
	}

}
