package Tasks.Arrays;

import java.util.Arrays;

public class MovesZero {

    public static void main(String[] args) {

        int[] num = {0, 1, 0, 3, 12};

        int pointer = 0;

        for(int i=0; i< num.length;i++) {

            if (num[i] != 0) {

                num[pointer] = num[i];
                pointer++;

                System.out.println(pointer);
            }

            System.out.println(Arrays.toString(num));
        }

//        System.out.println(Arrays.toString(num));

        while(pointer < num.length){
            num[pointer]= 0;
            pointer++;
            System.out.println(pointer);
        }

        System.out.println(Arrays.toString(num));
    }
}
