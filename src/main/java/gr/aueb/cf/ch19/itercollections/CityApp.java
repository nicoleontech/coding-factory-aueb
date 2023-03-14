package gr.aueb.cf.ch19.itercollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityApp {

    public static void main(String[] args) {
        //Populate
        List<String> cities = new ArrayList<>(List.of("Athens", "London", "Paris")); //modifiable
     //   List<String> cities = List.of("Athens", "London", "Paris"); //unmodifiable

        //Ways to iterate
        //1
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        //2
        for (String city : cities) {
            System.out.println(city);
            //ConcurrentModificationException
            // cities.remove("London");
        }

//        //3
        cities.forEach(System.out::println);
//
//        //4
        Iterator<String> iterator = cities.iterator();

        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            String city = iterator.next();
            if (city.equals("Athens")) {
                iterator.remove();
            }
        }

        cities.forEach(System.out::println);
        // cities.removeIf(s-> s.equals("London"));
    }
}
