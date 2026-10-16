package Tasks.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 10, 20};

        Set<Integer> vault = new HashSet<>();

        for(int num : arr){

            if(vault.add(num) == false){
                System.out.println(num);
            }
        }


//        for(int i =0; i<arr.length-1; i++){
//
//            for(int j=i+1; j<arr.length; j++){
//
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                   break;
//                }
//            }
//        }

    }
}
