package Tasks.collections;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for(int i=0; i< str.length();i++){

            char ch = str.charAt(i);

            set.add(ch);
        }

        System.out.println("Unique characters are: ");
        for(Character character: set){
            System.out.println(character);
        }
    }
}
