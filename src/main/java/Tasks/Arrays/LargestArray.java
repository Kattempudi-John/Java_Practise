package Tasks.Arrays;

public class LargestArray {

    public static void main(String[] args) {
        int[] arr = {10,50,20,40,30,60};

        int max = arr[0];
        int secondlarget= arr[0];

        for(int i=1; i<arr.length;i++){

            if( max < arr[i]){
                secondlarget = max;
                max = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(secondlarget);


    }
}
