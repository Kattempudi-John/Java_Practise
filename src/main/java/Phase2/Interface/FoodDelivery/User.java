package Phase2.Interface.FoodDelivery;

public class User {
    private int id;
    private String name;
    private int age;
    private boolean premium;



    public User(
            int id,
            String name,
            int age,
            boolean premium
    ) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.premium = premium;

    }



    public String getName(){

        return name;

    }


    public boolean isPremium(){

        return premium;

    }
}
