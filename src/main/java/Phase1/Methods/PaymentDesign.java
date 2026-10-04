package Phase1.Methods;

public class PaymentDesign {
    public static String getRole(){
        return "ADMIN";

    }

    public static void print(int value){
        System.out.println("value");
    }
    public static void main(String[] args) {
        System.out.println(getRole());
        print(1);
    }
}
