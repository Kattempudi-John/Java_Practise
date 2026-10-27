package Tasks.collections.arrays;

import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 10, 10,20};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(Integer number: numbers){

            if(set.contains(number)){
                duplicate.add(number);
            }
            else{
                set.add(number);
            }
        }

        System.out.println(duplicate);
    }
}
