package Phase2.polymorphism;

public class PaymentTest {
    public static void main(String[] args) {

        Payment payment = new UpiPayment();
        payment.pay();

        UpiPayment upiPayment = new UpiPayment();
        upiPayment.validateUPI();
    }
}
