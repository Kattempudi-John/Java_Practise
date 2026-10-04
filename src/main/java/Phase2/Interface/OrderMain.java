package Phase2.Interface;

public class OrderMain {

    public static void main(String[] args) {
        OrderService order = new OnlineOrderService();
        order.placeOrder();
        order.printInvoice();
        OrderService.validateOrder(101);
    }
}
