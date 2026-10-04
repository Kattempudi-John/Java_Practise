package JavaBasics;

import java.util.Scanner;

//isEven(int num)
//isPalindrome(int num)
//sumOfDigits(int num)
//reverseNumber(int num)

public class NumberAnalyzer {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int num = sc.nextInt();
            Boolean even = isEven(num);
            int reverse = reverseNumber(num);
            Boolean palindrome = isPalindrome(num);
            int sum =sumOfDigits(num);
            Boolean prime = isPrime(num);

            System.out.println("Is even:" + even);
            System.out.println("reverse number:" + reverse);
            System.out.println("Is palindrome: " + palindrome) ;
            System.out.println("Sum of digits: "+ sum);
            System.out.println("is Prime: " + prime);
        } catch (Exception e) {
            System.out.println("Invalid input!, please Enter valid number ");
        }
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static int reverseNumber(int num){
        int reverse = 0;
        while(num > 0){
            int digits = num % 10;
            reverse = (reverse * 10) + digits;
            num = num /10;
        }
        return reverse;
    }
    public static Boolean isPalindrome(int num){
        int reversed = reverseNumber(num);
        return num == reversed;
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int digits = num % 10 ;
            num = num /10;
            sum = sum + digits;
        }
        return sum;
    }

    public static boolean isPrime(int num){

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
