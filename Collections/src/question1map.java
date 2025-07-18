import java.util.*;

public class question1map {
	private HashMap<String, String> m1;

	public question1map () {
		m1 = new HashMap<>();
	}

	public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
		m1.put(countryName, capital);
		return m1;
	}

	public String getCapital(String countryName) {
		if (m1.containsKey(countryName)) {
			return m1.get(countryName);
		} else {
			return "Not Present";
		}
	}

	public String getCountry(String capitalName) {
		for (String s : m1.keySet()) {
			if (capitalName.equalsIgnoreCase(m1.get(s))) {
				return s;
			}
		}
		return "Not Found";
	}

	public HashMap<String, String> exchange() {
		HashMap<String, String> m2 = new HashMap<>();
		for (String s : m1.keySet()) {
			m2.put(m1.get(s), s);
		}
		return m2;
	}

	public ArrayList<String> getcountries() {
		ArrayList<String> al = new ArrayList<>();
		for (String s : m1.keySet()) {
			al.add(s);
		}
		return al;
	}

	public static void main(String[] args) {
		question1map obj = new question1map();
		System.out.println("Country-Capital Map: " + obj.saveCountryCapital("India", "Delhi"));
		System.out.println("Country-Capital Map: " + obj.saveCountryCapital("Japan", "Tokyo"));
		System.out.println("Capital of India: " + obj.getCapital("India"));
		System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));
		System.out.println("Capital-Country Map (Exchanged): " + obj.exchange());
		System.out.println("List of Countries: " + obj.getcountries());
	}
}
