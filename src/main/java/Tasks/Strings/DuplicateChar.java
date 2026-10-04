package Tasks.Strings;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name = sc.nextLine();

        for (int i=0; i<name.length(); i++){

            if (name.substring(0, i).indexOf(name.charAt(i)) != -1) {
                continue;
            }
            
            for(int j=i+1; j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    System.out.println(name.charAt(i));
                    System.out.println(name.indexOf(name.charAt(i)));
                    break;
                }
            }
        }

    }
}
