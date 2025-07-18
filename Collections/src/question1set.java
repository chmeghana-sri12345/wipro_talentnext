// package collection;

import java.util.*;

public class question1set {

	private HashSet<String> h1;

	public question1set() {
		h1 = new HashSet<>();
	}

	public HashSet<String> saveCountryName(String countryName) {
		h1.add(countryName); // OR use: h1.add(countryName.toLowerCase());
		return h1;
	}

	public String getCountry(String countryName) {
		for (String s : h1) {
			if (s.equalsIgnoreCase(countryName)) {
				return s;
			}
		}
		return "Country not found";
	}

	public static void main(String[] args) {
		question1set obj = new question1set();
		System.out.println("Set after adding India: " + obj.saveCountryName("India"));
		System.out.println("Set after adding usa: " + obj.saveCountryName("usa"));
		System.out.println("Searching for 'usa': " + obj.getCountry("usa"));    // Should return "usa"
		System.out.println("Searching for 'china': " + obj.getCountry("china")); // Should return "Country not found"
	}
}
