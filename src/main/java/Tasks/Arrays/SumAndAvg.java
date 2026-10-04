package Tasks.Arrays;

public class SumAndAvg {

    public static void main(String[] args) {
        int[] arr = {10, 20, 31, 40, 50};
        int sum =0;
        double avrg = 0;
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        avrg = (double) sum / arr.length;

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of Sum: " + avrg);

    }
}
