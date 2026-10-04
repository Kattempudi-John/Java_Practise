package Phase2.Interface.FoodDelivery;

public class Order {
    private int orderId;
    private String foodName;
    private int quantity;
    private double price;



    public Order(
            int orderId,
            String foodName,
            int quantity,
            double price
    ){

        this.orderId = orderId;
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;

    }



    public int getOrderId(){

        return orderId;

    }


    public String getFoodName(){

        return foodName;

    }


    public int getQuantity(){

        return quantity;

    }


    public double getPrice(){

        return price;

    }
}
