package Phase1;

public class CountDigitsInString {
    public static void main(String[] args) {
        String name = "john2123john";
        int digitsCount = 0;
        for (int ch = 0; ch < name.length(); ch++) {
            if (name.charAt(ch) >= '0' && name.charAt(ch) <= '9') {
                digitsCount++;
            }
        }
        System.out.println(digitsCount);
    }
}
