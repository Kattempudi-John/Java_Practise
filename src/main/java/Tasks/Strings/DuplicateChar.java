package Tasks.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {

        String name = "kattea";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> row : map.entrySet()) {

            if (row.getValue() > 1) {
                System.out.println(row.getKey() + " appears " + row.getValue() + " times.");
            }
        }
    }
}
//        String name = "kattea";
//        int count = 0;
//
//        for(int i=0; i < name.length()-1; i++){
//
//            for(int j=i+1; j<name.length();j++){
//
//                if(name.charAt(i)==name.charAt(j)){
//                    System.out.println(name.charAt(i));
//                    count++;
//                    break;
//                }
//
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String");
//        String name = sc.nextLine();
//
//        for (int i=0; i<name.length(); i++){
//
//            if (name.substring(0, i).indexOf(name.charAt(i)) != -1) {
//                continue;
//            }
//
//            for(int j=i+1; j<name.length();j++){
//                if(name.charAt(i)==name.charAt(j)){
//                    System.out.println(name.charAt(i));
//                    System.out.println(name.indexOf(name.charAt(i)));
//                    break;
//                }
//            }
//        }

