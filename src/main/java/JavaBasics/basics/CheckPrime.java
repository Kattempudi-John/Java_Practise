package JavaBasics.basics;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 15, count = 0;

        // 1. Handle boundary edge case (Crucial for testing!)
        if (num <= 1) {
            count = -1; // Flag it as not prime immediately
        } else {
            // 2. Optimized Loop: only go up to half of the number (num / 2)
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break; // 3. Performance optimization: Stop immediately if a factor is found!
                }
            }
        }

        // 4. Corrected logic check
        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
    }
}
