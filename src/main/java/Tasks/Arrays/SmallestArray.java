package Tasks.Arrays;

public class SmallestArray {

    public static void main(String[] args) {

        int[] arr = {20,10,30,40,50};
        int min = arr[0];

        for(int i=1;i<arr.length;i++){

            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
