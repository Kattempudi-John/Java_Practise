package Phase2.classeAndObjects;

public class ObjectDesign {

    int orderId;
    String customerEmail;
    String address;

    public void order(int orderId){
        System.out.println("Order ID: " + orderId);
        customer("John@gmail.com");
    }

    public void customer(String customerEmail){
        System.out.println("Customer ID: " + customerEmail);
        address("2-100, 1st line");
    }

    public void address(String address){
        System.out.println("Address ID: " + address);
    }

    public static void main(String[] args) {
        ObjectDesign obj1 = new ObjectDesign();
        obj1.order(101);
    }
}
