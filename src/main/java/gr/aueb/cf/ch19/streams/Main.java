package gr.aueb.cf.ch19.streams;

import gr.aueb.cf.ch19.products.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Orange", 2.5, 1),
                new Product("Orange", 1.5, 2),
                new Product("Lemons", 4.5, 1),
                new Product("Corn", 23.5, 1),
                new Product("Oil", 1.5, 1)
        ));

        List<Product> oranges = products.stream()
                .filter(product -> product.getDescription().equals("Orange"))
                .collect(Collectors.toList());

        oranges.forEach(System.out::println);

        List<Product> notOranges = products.stream()
                .filter(product -> !product.getDescription().equals("Orange"))
                .sorted(Comparator.comparing(Product::getDescription))
                .collect(Collectors.toList());

        List<Double> productPrices = products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());
        productPrices.forEach(System.out::println);

        List<Product> updatedProductPrices = products.stream()
                .map(product -> new Product(product.getDescription(), product.getPrice() * 0.2, product.getQuantity()))
                .collect(Collectors.toList());

        products.forEach(System.out::println);


        int orangesTotalCount = products.stream()
                .filter(product -> product.getDescription().equals("Orange"))
                .reduce(0, (total, el) -> total + el.getQuantity(), Integer::sum);

        System.out.println(orangesTotalCount);


    }
}
