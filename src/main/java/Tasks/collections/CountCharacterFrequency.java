package Tasks.collections;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {

    public static void main(String[] args) {

        String str = "automation";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0; i<str.length();i++){

            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}

//First non-repeated character — HashMap
//Reverse a string — loop and StringBuilder
//Palindrome — two pointers or reverse comparison
//Anagrams — sorting or frequency counting
//Word frequency — HashMap<String, Integer>
