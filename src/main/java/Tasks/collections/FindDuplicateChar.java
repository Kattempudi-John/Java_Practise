package Tasks.collections;

import java.util.HashSet;

public class FindDuplicateChar {

    public static void main(String[] args) {

        String str = "programming";
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for(int i=0; i < str.length();i++){

            char ch = str.charAt(i);

            if(seen.contains(ch)){
                duplicate.add(ch);
            }
            else {
                seen.add(ch);
            }
        }

        System.out.println("Duplicate Characters are: " + duplicate);
    }



}
