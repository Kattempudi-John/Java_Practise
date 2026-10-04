package Phase2.Interface;

public interface OrderService {

    void placeOrder();

    default void printInvoice(){
        System.out.println("Invoice Generated");
    }

    static void validateOrder(int id){
        if(id <= 0 ){
            throw new RuntimeException(
                    "Invalid Order ID"
            );
        }
    }
}
