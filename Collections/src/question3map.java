// package collection;

import java.util.*;

public class question3map {

    public static void main(String[] args) {
        Properties stateCapitals = new Properties();

        stateCapitals.setProperty("Andhra Pradesh", "Amaravati");
        stateCapitals.setProperty("Karnataka", "Bengaluru");
        stateCapitals.setProperty("Tamil Nadu", "Chennai");
        stateCapitals.setProperty("Maharashtra", "Mumbai");
        stateCapitals.setProperty("West Bengal", "Kolkata");

        // Safer way to iterate
        Set<String> states = stateCapitals.stringPropertyNames();
        for (String state : states) {
            String capital = stateCapitals.getProperty(state);
            System.out.println(state + " - " + capital);
        }
    }
}
