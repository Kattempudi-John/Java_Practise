package Tasks.Strings;

public class ReverseString {

    public static void main(String[] args) {

        String name = "abcba";

        char[] chars = name.toCharArray();

        int left = 0;
        int right = chars.length-1;

        while(left < right){

            char temp = chars[left];
            chars[left] = chars [right];
            chars[right] = temp;

            left++;

            right--;
        }

        System.out.println(name);

        System.out.println(chars);


        if(name.equals(String.valueOf(chars))){
            System.out.println("Palindrome");
        }

        else {
            System.out.println("Not Plandrome");
        }
//        String name = "abcba";
//
//        StringBuilder builder = new StringBuilder(name);
//
//        builder.reverse();
//
//        System.out.println("Original Name: " + name);
//
//        System.out.println("Reverse Name: " + builder);
//
//        if(name.equals(builder.toString())){
//            System.out.println("Enter String is Palindrome");
//        }
//
//        else{
//            System.out.println("Enter String is not palindrome");
//        }

// ====================================================================================

//        String name = "john";
//        String reverse="";
//        for(int i=name.length()-1;i>=0;i--){
//            reverse = reverse + name.charAt(i);
//        }
//
//        System.out.println(name);
//        System.out.println(reverse);

    }
}
