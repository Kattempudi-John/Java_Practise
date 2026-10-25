package Tasks.collections;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastIndex {
    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Laptop");
        products.add("Mouse");

        System.out.println("First index of Mouse: " + products.indexOf("Mouse"));
        System.out.println("Last index of Mouse: " + products.lastIndexOf("Mouse"));
        System.out.println("First index of Printer: " + products.indexOf("Printer"));
        System.out.println("First index of keyboard: " + products.indexOf("Keyboard"));

    }
}
