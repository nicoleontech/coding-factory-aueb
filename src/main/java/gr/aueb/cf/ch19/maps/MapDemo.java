package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        //External curly braces are for the anonymous class
        //and internals are for population/ initialization
        Map<String, String> countries1 = new HashMap<>() {
            {
                put("Gr", "Greece");
                put("Fr", "France");
            }
        };

        // After JDK9
        Map<String, String> countries2 = Map.of(
                "Gr", "Greece",
                "Fr", "France"
        );

        Map<String, String> countries3 = new HashMap<>(
                Map.of("De", "Germany",
                        "It", "Italy"
                ));
        countries1.put("Fi", "Finland");

        //Iteration
        Iterator<Map.Entry<String, String>> iterator = countries1.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
