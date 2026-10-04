package HackerRank;

import java.util.Scanner;

public class IfElsePractise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int N = sc.nextInt();
        if( N % 2 == 0){
            if (N >=6 && N <= 20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Weird");
        }
        sc.close();

    }
}
