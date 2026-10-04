package Tasks.Arrays;

public class CountEvenAndOdd {

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        int counteven=0;
        int countodd=0;

        for(int i=0; i< arr.length;i++){
            if(i%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }

        System.out.println("Count even are: " + counteven);

        System.out.println("Count Odd are: " + countodd);
    }
}
