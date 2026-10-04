package Phase1.ArrayConcepts;

public class ArrayLoop {

    public static void main(String[] args) {
        int [] marks = {10, 20, 30, 40, 50};

        int sum = 0;
        for(int i =0; i > marks.length; i--){
            sum += marks[i];
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
