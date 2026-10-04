package Phase1.ArrayConcepts;

public class LargeArray {
    public static void main(String[] args) {
        int[] marks = {50, 10, 20, 30, 40};
        int largest = marks[0];
        int secondLargest = marks[1];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > largest) {
                secondLargest = largest;
                largest = marks[i];
            }else if (marks[i] > secondLargest) {
                secondLargest = marks[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
