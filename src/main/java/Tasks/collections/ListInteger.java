package Tasks.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        numbers.remove(1);

        System.out.println(numbers);
        numbers.remove(Integer.valueOf(30));

        System.out.println(numbers);
    }
}
