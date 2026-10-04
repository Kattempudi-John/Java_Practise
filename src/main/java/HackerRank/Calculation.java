package HackerRank;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1; i<=10; i++){
            int results = number * i;
            System.out.printf("%d x %d = %d%n", number, i, results);
        }
    }
}
