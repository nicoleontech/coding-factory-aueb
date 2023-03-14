package gr.aueb.cf.ch19.sets;

import java.util.Set;
import java.util.TreeSet;

public class BagOfCoins {

    public static void main(String[] args) {
        Set<String> bag = new TreeSet<>();

        bag.add("1 euro");
        bag.add("1 cent");
        bag.add("50 cents");
        bag.add("100 euros");

        bag.forEach(System.out::println);

        bag.remove("1 cent");

        bag.forEach(System.out::println);
    }
}
