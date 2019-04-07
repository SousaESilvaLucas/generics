package application;

import java.util.Map;
import java.util.TreeMap;

public class Program6 {

	public static void main(String[] args) {
		Map <String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.put("phone", "982651127");
		
		System.out.println("ALL COOKIES");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

		System.out.println("Cotains key phone: " + cookies.containsKey("phone"));
		System.out.println("Address :" + cookies.get("adress"));
	}

}
