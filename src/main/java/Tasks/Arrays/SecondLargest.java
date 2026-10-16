package Tasks.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] num = {10,40,50,20,60};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i < num.length;i++){

            if(num[i]>largest){
                secondLargest = largest;
                largest = num[i];
            } else if (num[i]> secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
//        int[] arr = {10,50,20,40,30,60};
//
//        int max = arr[0];
//
//        for(int i=1; i<arr.length;i++){
//
//            if( max < arr[i]){
//                max = arr[i];
//            }
//        }
//
//        System.out.println(max);
//    }
}
