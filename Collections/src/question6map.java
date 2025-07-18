// package collection;

import java.util.*;

public class question6map {

    private Hashtable<String, String> ht = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        ht.put(countryName, capital);
        return ht;
    }

    public String getCapital(String countryName) {
        return ht.getOrDefault(countryName, "not present");
    }

    public String getCountry(String capitalName) {
        for (String s : ht.keySet()) {
            if (capitalName.equalsIgnoreCase(ht.get(s))) {
                return s;
            }
        }
        return "not present";
    }

    public HashMap<String, String> exchange() {
        HashMap<String, String> m2 = new HashMap<>();
        for (String s : ht.keySet()) {
            m2.put(ht.get(s), s);
        }
        return m2;
    }

    public ArrayList<String> getcountries() {
        return new ArrayList<>(ht.keySet());
    }

    public static void main(String[] args) {
        question6map obj = new question6map ();

        System.out.println(obj.saveCountryCapital("India", "Delhi"));
        System.out.println(obj.saveCountryCapital("Japan", "Tokyo")); // ✅ fixed typo
        System.out.println(obj.saveCountryCapital("Germany", "Berlin"));

        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));
        System.out.println("Exchanged Map (Capital → Country): " + obj.exchange());
        System.out.println("List of Countries: " + obj.getcountries());
    }
}
