package Phase1;

public class StringVowel {
    public static void main(String[] args) {
        String name = "javadeveloper";
        int VowelCount = 0;
        int constantCount = 0;
        for(int ch = 0; ch < name.length(); ch++){

            if(name.charAt(ch) == 'a' || name.charAt(ch) == 'e'|| name.charAt(ch) =='i' || name.charAt(ch) == 'o'||name.charAt(ch) == 'u'){
                VowelCount++;
            }
            else{
                constantCount++;
            }
        }
        System.out.println(VowelCount);
        System.out.println(constantCount);
    }
}
