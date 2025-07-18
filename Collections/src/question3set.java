// package collection;

import java.util.*;

public class question3set {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Sunday");
        ts.add("Monday");
        ts.add("Tuesday");
        ts.add("Wednesday");
        ts.add("Thursday");
        ts.add("Friday");

        NavigableSet<String> r = ts.descendingSet();
        System.out.println("Descending Order: " + r);

        System.out.println("All Days:");
        Iterator<String> i = ts.iterator(); // ✅ Use generic type
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        String check = "Friday";
        if (ts.contains(check)) {
            System.out.println(check + " exists");
        } else {
            System.out.println(check + " does not exist");
        }
    }
}
