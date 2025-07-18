// package collection;

import java.util.*;

public class question2map {

    private HashMap<String, String> hm = new HashMap<>();

    public question2map(HashMap<String, String> hm) {
        this.hm = hm;
    }

    public void addEntry(String key, String value) {
        hm.put(key, value);
    }

    public boolean checkKey(String s) {
        return hm.containsKey(s);  // or make it case-insensitive if needed
    }

    public boolean checkValue(String s) {
        for (String k : hm.keySet()) {
            if (s.equalsIgnoreCase(hm.get(k))) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
    	question2map obj = new question2map(new HashMap<>());
        obj.addEntry("mahesh babu", "dfmb");
        obj.addEntry("ntr", "tigers");
        obj.addEntry("pk", "pawalas");
        obj.addEntry("bhAAi", "cake");

        System.out.println(obj.checkKey("ntr"));     // true
        System.out.println(obj.checkValue("cake"));  // true
        obj.print();
    }
}
