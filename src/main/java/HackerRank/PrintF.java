package HackerRank;

import java.util.Scanner;

public class PrintF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int d;
        for (int i=0; i<3;i++) {

            s = sc.next();
            d = sc.nextInt();
            System.out.printf("%-15s%03d", s , d);
        }


    }
}
