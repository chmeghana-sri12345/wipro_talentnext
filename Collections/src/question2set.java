

import java.util.*;

public class question2set {

    public static void main(String[] args) {
        HashSet<String> emp = new HashSet<>();
        emp.add("Mahesh Babu");
        emp.add("NTR");
        emp.add("Balayya");
        emp.add("bhAAi");
        emp.add("Ram charan");

        Iterator<String> i = emp.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
