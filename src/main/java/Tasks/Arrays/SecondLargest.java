package Tasks.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {10,50,20,40,30,60};

        int max = arr[0];

        for(int i=1; i<arr.length;i++){

            if( max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
