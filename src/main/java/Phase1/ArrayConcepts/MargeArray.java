package Phase1.ArrayConcepts;

public class MargeArray {
    public static void main(String[] args) {
        int [] arr1 = {10, 20, 30};
        int [] arr2 = {40, 50, 60};
        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;

        // Copy arr1 into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;
        }

        // Copy arr2 into merged
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }

        // Print merged array
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
