package JavaBasics;

//String checkNumberType(int num)
//boolean isArmstrong(int num)
//boolean isPerfect(int num)

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            String number = checkNumberType(num);
            boolean armstrong = isArmStrong(num);
            boolean perfect = isPerfect(num);

            System.out.println("number type: " + number);
            System.out.println("is Armstrong: " + armstrong);
            System.out.println("is Perfect: " + perfect);
        } catch (Exception e) {
            System.out.println("Invalid input, please Enter a valid number");
        }


    }
    public static String checkNumberType(int num){
        if(num > 0){
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        }
        else {
            return "Zero";
        }
    }

    public static boolean isArmStrong(int num){
        int sum = 0, temp = num;
        while(num>0){
            int digits = num % 10;
            sum = sum + (digits * digits * digits);
            num = num/10;
        }
        return temp == sum;
    }

    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum == num;
    }

}
