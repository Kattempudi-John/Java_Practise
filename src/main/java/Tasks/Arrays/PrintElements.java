package Tasks.Arrays;

public class PrintElements {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        for(int id: numbers){
            System.out.println(id);
        }

        System.out.println(numbers.length);

        System.out.println("Print 1st element: " + numbers[0]);
        System.out.println("Print last element" + numbers[numbers.length-1]);
    }
}
