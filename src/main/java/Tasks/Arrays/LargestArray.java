package Tasks.Arrays;

public class LargestArray {

    public static void main(String[] args) {
        int[] arr = {10,50,20};

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
                System.out.println(largest);
            }
        }

        System.out.println(largest);




    }
}
