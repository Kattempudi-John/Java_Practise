package Phase1;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30,20};
        boolean alreadyExists = false;

        for(int i=0; i < arr.length;i++){
            if(arr[i] == arr.length-1 ){
                alreadyExists = true;
                continue;
            }
            System.out.println(arr[i]);
        }


    }
}
