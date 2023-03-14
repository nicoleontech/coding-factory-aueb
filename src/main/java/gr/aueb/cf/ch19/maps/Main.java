package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.products.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>() {
            {
                put("ORA", new Product("Oranges", 10.5, 20));
                put("HON", new Product("Honey", 13.5, 10));
                put("MIL", new Product("Milk", 1.5, 1));
                put("EGG", new Product("Eggs", 8.2, 6));

            }
        };

        //filtering at runtime
        Map<String, Object> criteria = new HashMap<>() {{
            put("description", "Eggs");
            put("price", 7.5);
        }};

        //From the filters that the user selected, they want eggs with price > 7.5
        String eggs = products.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description"))
                        && (Double.compare(product.getPrice(), (Double) criteria.get("price")) > 0))
                .map(Product::toString)
                .collect(Collectors.joining());
        System.out.println(eggs);

        String oranges = products.entrySet().stream()
                .filter(entry -> entry.getKey().equals("ORA"))
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(oranges);

        List<Product> productsByPrice = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .collect(Collectors.toList());

        int total = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);

        System.out.println(total);

    }
}
