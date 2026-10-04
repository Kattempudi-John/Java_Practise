package Phase2.Interface;

public interface PaymentService {

    void pay();

    default void generateReceipt(){
        System.out.println("Generic Receipt");
    }
}
