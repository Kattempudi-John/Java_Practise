package Tasks.Arrays;

public class SearchElement {

    public static void main(String[] args) {
        int[]arr = {10, 20, 30, 40, 50};

        for(int i=0; i<arr.length;i++){
            if(arr[i] == 30){
                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
}
