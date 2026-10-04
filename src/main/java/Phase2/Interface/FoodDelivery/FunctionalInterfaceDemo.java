package Phase2.Interface.FoodDelivery;

import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {


        User user = new User(
                101,
                "John",
                25,
                true
        );


        Order order = new Order(
                5001,
                "Pizza",
                2,
                300
        );


        /*
         =====================================================
         1. Predicate
         =====================================================

         Purpose:
         Input -> condition -> true/false

         Real time:
         Validation, filtering, checking conditions

         Example:
         Check whether user is premium
         */


        Predicate<User> isPremiumUser =
                u -> u.isPremium();


        System.out.println(
                "Premium User: "
                        + isPremiumUser.test(user)
        );



        /*
         =====================================================
         2. Function
         =====================================================

         Purpose:
         Input -> Process -> Output

         Real time:
         Entity to DTO conversion
         Data transformation
         */


        Function<User,String> userNameExtractor =
                u -> u.getName();



        String name =
                userNameExtractor.apply(user);


        System.out.println(
                "User Name: "
                        + name
        );




        /*
         =====================================================
         3. Consumer
         =====================================================

         Purpose:
         Input -> No return value

         Real time:
         Email, SMS, Logging
         */


        Consumer<Order> sendNotification =
                o -> {

                    System.out.println(
                            "Notification sent for Order ID: "
                                    + o.getOrderId()
                    );

                };


        sendNotification.accept(order);





        /*
         =====================================================
         4. Supplier
         =====================================================

         Purpose:
         No Input -> Gives Output

         Real time:
         Generate IDs, OTP, default values

         */


        Supplier<String> generateOrderId =
                () -> "ORD-" + System.currentTimeMillis();



        System.out.println(
                "Generated Order ID: "
                        + generateOrderId.get()
        );





        /*
         =====================================================
         5. BiPredicate
         =====================================================

         Two inputs -> true/false

         Real time:
         Multiple condition validation

         */


        BiPredicate<Integer,Boolean> deliveryEligibility =
                (age,premium)
                        -> age >=18 && premium;



        System.out.println(
                "Delivery Offer Eligible: "
                        +
                        deliveryEligibility.test(
                                25,
                                true
                        )
        );





        /*
         =====================================================
         6. BiFunction
         =====================================================

         Two inputs -> Output

         Real time:
         Calculations

         Example:
         quantity * price

         */


        BiFunction<Integer,Double,Double>
                calculatePrice =
                (quantity,price)
                        -> quantity * price;



        double totalAmount =
                calculatePrice.apply(
                        order.getQuantity(),
                        order.getPrice()
                );


        System.out.println(
                "Total Amount: "
                        + totalAmount
        );





        /*
         =====================================================
         7. BiConsumer
         =====================================================

         Two inputs -> No output

         Real time:
         Processing two objects together

         */


        BiConsumer<String,Double> printBill =
                (food,amount)
                        -> {

                    System.out.println(
                            "Food: "
                                    + food
                                    +
                                    " Amount: "
                                    + amount
                    );

                };


        printBill.accept(
                order.getFoodName(),
                totalAmount
        );






        /*
         =====================================================
         8. UnaryOperator
         =====================================================

         Same input type -> Same output type

         Real time:
         Modify existing value

         Example:
         Add GST

         */


        UnaryOperator<Double> addGST =
                amount ->
                        amount + (amount * 0.18);



        double finalAmount =
                addGST.apply(totalAmount);



        System.out.println(
                "Final Amount with GST: "
                        + finalAmount
        );






        /*
         =====================================================
         9. BinaryOperator
         =====================================================

         Two same type inputs -> Same type output

         Real time:
         Combine values

         */


        BinaryOperator<Double> addDiscount =
                (amount,discount)
                        -> amount - discount;



        double discountedAmount =
                addDiscount.apply(
                        finalAmount,
                        50.0
                );


        System.out.println(
                "Final Payable Amount: "
                        + discountedAmount
        );

    }
}
