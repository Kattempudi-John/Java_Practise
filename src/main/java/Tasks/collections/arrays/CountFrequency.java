package Tasks.collections.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10};

        int index = numbers[0];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int number: numbers){

            if(map.containsKey(number)){
                map.put(number, map.get(number) + 1);
            }
            else{
                map.put(number, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
