package Tasks.Strings;

public class Vowels {
    public static void main(String[] args) {
        String msg = "Good Morning";
        String lower = msg.toLowerCase();

        for(int i=0; i< lower.length();i++){
            char ch = lower.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                System.out.println(lower.charAt(i));
            }
        }
    }
}
