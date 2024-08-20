package ch15.first;

import java.util.ArrayList;
import java.util.List;


public class LanguageEx {

	public static void main(String[] args) {

		Language language1 = new Language("Korean", 82);
		
//		System.out.println(languages.name);
		
//		ArrayList<Language> arraylist = new ArrayList<>();
		
		List<Language> languages = new ArrayList<>();
		
//		list.add("asdsad"); //에러 language 객체 생성
		
		languages.add(language1);
		
		Language language2 = new Language("USA",10);
		Language language3 = new Language("Japan", 11);
		
		languages.add(language2);
		languages.add(language3);
		
		languages.add(new Language("England", 15));
		
//		Car car = new Car("Hyundai", 2000);
		
//		list.add(car); // error : language 객체만 담을 수 있다.
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Hyundai", 2000));
		cars.add(new Car("BMW", 2000));
		cars.add(new Car("KIA", 2000));
		
		for(Car car: cars) {
			System.out.println("car.name: " + car.getName());
		}
		
		System.out.println("----------------");
		List<Car> list2 = new ArrayList<>();
		
//		list2.add(car);
		
//		--------------------
		
		languages.get(3).name = "UK";
		
		for(int i = 0; i < languages.size(); i++) {
//			System.out.println("i : " + i);
//			System.out.println(list.get(i));
			System.out.println("languages.get("+ i + ").name: " + languages.get(i).name);
		}

		System.out.println("----------------");
		
		for(Language language: languages) {
			System.out.println("languge.name: " + language.name);
		}
		
	}

}
