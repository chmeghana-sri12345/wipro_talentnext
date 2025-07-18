// package collection;

import java.util.*;

public class question5map {

    private TreeMap<String, String> tm = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        tm.put(countryName, capital);
        return tm;
    }

    public String getCapital(String countryName) {
        return tm.getOrDefault(countryName, "Not Present");
    }

    public String getCountry(String capitalName) {
        for (String s : tm.keySet()) {
            if (capitalName.equalsIgnoreCase(tm.get(s))) {
                return s;
            }
        }
        return "Capital Not Found";
    }

    public HashMap<String, String> exchange() {
        HashMap<String, String> m2 = new HashMap<>();
        for (String s : tm.keySet()) {
            m2.put(tm.get(s), s);
        }
        return m2;
    }

    public ArrayList<String> getcountries() {
        return new ArrayList<>(tm.keySet());
    }

    public static void main(String[] args) {
       question5map obj = new question5map();

        System.out.println(obj.saveCountryCapital("India", "Delhi"));
        System.out.println(obj.saveCountryCapital("Japan", "Tokyo"));
        System.out.println(obj.saveCountryCapital("Germany", "Berlin"));

        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));
        System.out.println("Exchanged Map (Capital → Country): " + obj.exchange());
        System.out.println("List of Countries: " + obj.getcountries());
    }
}
