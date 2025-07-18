
import java.util.*;

public class question4map {

    private HashMap<String, Integer> hm = new HashMap<>();

    public void addContact(String name, Integer num) {
        hm.put(name, num);
    }

    public boolean checkName(String name) {
        return hm.containsKey(name);
    }

    public boolean checkNum(Integer num) {
        return hm.containsValue(num);
    }

    public void print() {
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        question4map obj = new question4map();
        obj.addContact("bhAAi", 12345);
        obj.addContact("bob", 98765);
        obj.addContact("pk", 212121);
        obj.addContact("balayya", 34567);

        System.out.println(obj.checkName("pk"));     // true
        System.out.println(obj.checkNum(12345));     // true
        obj.print();
    }
}
