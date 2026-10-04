package Phase2.Interface;

public class TestPayment {
    public static void main(String[] args) {
        PaymentService payment =
                new CardPayment();
        payment.pay();
        payment.generateReceipt();


    }
}
