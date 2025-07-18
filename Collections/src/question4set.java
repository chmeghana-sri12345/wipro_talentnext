// package collection;

import java.util.*;

public class question4set {

    private TreeSet<String> ts;

    public question4set() {
        ts = new TreeSet<>();
    }

    public TreeSet<String> saveCountryName(String countryName) {
        ts.add(countryName);
        return ts;
    }

    public String getCountry(String countryName) {
        for (String s : ts) {
            if (s.equalsIgnoreCase(countryName)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        question4set obj = new question4set();

        System.out.println(obj.saveCountryName("India"));
        System.out.println(obj.saveCountryName("USA"));
        System.out.println(obj.saveCountryName("Japan"));

        String result1 = obj.getCountry("usa");
        System.out.println(result1 != null ? result1 : "Not Found");

        String result2 = obj.getCountry("china");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}
