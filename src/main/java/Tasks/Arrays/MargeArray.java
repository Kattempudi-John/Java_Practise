package Tasks.Arrays;

import java.util.Arrays;

public class MargeArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30 , 40};
        int[] arr2 = {50, 60, 70};

        int[] arr3 = Arrays.stream(arr1).toArray();

    }
}
