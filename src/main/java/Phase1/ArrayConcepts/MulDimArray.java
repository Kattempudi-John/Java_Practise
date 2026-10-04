package Phase1.ArrayConcepts;

public class MulDimArray {
    public static void main(String[] args) {
        int[][] marks = {
                {10, 20, 30},
                {40, 50, 60},
        };
        System.out.println(marks.length);

        for(int row = 0; row < marks.length; row++) {

            for(int col = 0; col < marks[row].length; col++) {

                System.out.println(marks[row][col]);

            }
        }

    }
}
