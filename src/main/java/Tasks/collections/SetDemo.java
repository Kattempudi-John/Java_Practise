package Tasks.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> products = new HashSet<>();

        products.add("Java");
        products.add("Selenium");
        products.add("TestNG");
        products.add("Java");
        products.add("RestAssured");

        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.contains("Selenium"));

        products.add("Selenium");

        System.out.println(products.size());

        products.remove("TestNG");

        System.out.println(products);
    }
}