package Tasks.collections.arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] numbers = {10,20,10,30,20,40,50};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(Integer number: numbers){
            set.add(number);
        }

        System.out.println(set);


    }
}
