package Phase1;

public class RevarseArray {

    public static void main(String[] args) {

        int[] arry = {10, 20, 30, 40 ,50};

        int left = 0;
        int right = arry.length-1;

        while(left<right){

            int temp = arry[left];
            arry[left] = arry[right];
            arry[right] = temp;

            left++;
            right--;
        }

        for(int i =0; i< arry.length; i++){
            System.out.println(arry[i]);
        }
    }
}
