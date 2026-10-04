package Phase1.ArrayConcepts;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] arr1 = {10, 20, 30};
        int [] arr2 = {10, 25, 30};
        boolean equal = true;
        if(arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                }
            }
        }else {
            equal = false;
        }
        System.out.println(equal);

    }
}
