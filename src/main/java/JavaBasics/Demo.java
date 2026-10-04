package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements");
        for(int i=0; i< arr.length;i++){
            arr[i] =sc.nextInt();
        }

//        for(int i=0)
    }
}
