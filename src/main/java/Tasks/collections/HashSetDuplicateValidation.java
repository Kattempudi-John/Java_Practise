package Tasks.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDuplicateValidation {

    public static void main(String[] args) {

        List<String> actualProducts = Arrays.asList("Java","Selenium","TestNG", "Java");

        Set<String> uniqueProducts = new HashSet<>(actualProducts);

        System.out.println("Original Products size: " + actualProducts.size());
        System.out.println("Unique products size: " + uniqueProducts.size());

        if (actualProducts.size()!= uniqueProducts.size()){
            System.out.println("Duplicate Products Found");
        }else {
            System.out.println("No duplicate products found");
        }

        uniqueProducts.add("Cucumber");
        uniqueProducts.add("Java");

        System.out.println(actualProducts);
        System.out.println(uniqueProducts);

    }
}
