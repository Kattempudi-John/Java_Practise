package Phase1.Methods;

public class TestUser {

    public static void changeName(User user){
        user.name = "John";
    }

    public static void main(String[] args) {
        User user = new User();
        user.name = "Mahesh";
        changeName(user);
        System.out.println(user.name);
    }
}
