package Tasks.Strings;

public class CountSpaces {

    public static void main(String[] args) {
        String name = "Java Selenium Automation";
        char space = ' ';
        int count=0;

        for(int i=0; i<name.length();i++){
            char ch = name.charAt(i);
            if(space == ch){
               count++;
            }
        }
        System.out.println(count);
    }
}
