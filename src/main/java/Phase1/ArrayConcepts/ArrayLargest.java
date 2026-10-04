package Phase1.ArrayConcepts;

public class ArrayLargest {
    public static void main(String[] args) {
        int [] arr = {10,20,40,10,35,72,50,10};

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int find = 10;
        int index = -1;
        boolean found = false;
        int target = 10;
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] == target){
                count++;
            }

            if(arr[i] == find){
                index = i ;
            }
            if(arr[i] == find) {
                found = true;
                break;
            }
            System.out.println("Print values : " + arr[i]);

        }
        System.out.println(found);
        double avg = (double) sum / arr.length;
        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);
        System.out.println("Sum is " + sum);
        System.out.println("arr length is " + arr.length);
        System.out.println("Avg is " + avg);
        System.out.println("Index is " + index);
        System.out.println("Count is " + count);
    }
}
