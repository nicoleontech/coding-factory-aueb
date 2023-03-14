package gr.aueb.cf.ch19.products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Orange",2.5,1),
                new Product("Lemons",4.5,1),
                new Product("Corn",23.5,1),
                new Product("Oil",1.5,1)
        ));

        /* sorting using Comparable interface

        Collections.sort(products, Comparator.naturalOrder());

        products.forEach(System.out::println);

        System.out.println();

        Collections.sort(products, Comparator.reverseOrder());

        products.forEach(System.out::println);
        */

        //sorting using Comparator
        products.sort(Comparator.comparing(Product::getDescription, Comparator.reverseOrder()));
        products.forEach(System.out::println);

        //Using multiple properties to sort
        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getQuantity));

        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice, (a1,a2) -> Double.compare(a1,a2)));

    }
}
