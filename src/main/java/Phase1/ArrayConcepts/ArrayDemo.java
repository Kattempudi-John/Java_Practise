package Phase1.ArrayConcepts;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] marks = {30, 40, 50, 10 , 60};
        System.out.println(marks);
        marks[1]= 90;
        System.out.println(marks[1]);
        System.out.println(marks.length);
        System.out.println(marks[marks.length-1]);

        int[] prices = new int[5];
        String[] names = new String[5];
        char [] alpha = new char[5];
        double[] salarys = new double[5];
        float[] floatvalues = new float[5];
        long [] longs = new long[5];
        boolean [] booleans = new boolean[5];
        byte [] bytes = new byte[5];
        System.out.println("========");
        System.out.println(prices[1]);
        System.out.println(names[1]);
        System.out.println(alpha[1]);
        System.out.println(salarys[1]);
        System.out.println(floatvalues[1]);
        System.out.println(longs[1]);
        System.out.println(booleans[1]);
        System.out.println(bytes[1]);

    }
}
