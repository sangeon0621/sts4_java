package ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("이상언", 100);
		map.put("이상욱", 100);
		map.put("우현준", 100);
		map.put("안효근", 100);
//		map.put("안효근", "ㅁㅇㄴㅁㅇ");
		
		map.forEach((key, value)-> {
			System.out.println(key + " : " + value);
		});
		
		System.out.println("----------------");
		
//		for( String strKey : map.keySet() ) {
//			Integer strValue = map.get(strKey);
//			System.out.println(strKey + " : " + strValue);
//		}
		
	}

}
