
package Phase1;

public class ForDemo {

    public static void main(String[] args) {


        for(int i = 1; i <=5; i++){
            if(i == 3){
                System.out.println("Found");
                break;
            }
            System.out.println(i);
        }

        System.out.println("Done");

        for(int j = 6; j <=10; j++){
            if(j == 8){
//                System.out.println("Found");
                continue;
            }
            System.out.println(j);
        }
//        System.out.println(i);
    }
}
