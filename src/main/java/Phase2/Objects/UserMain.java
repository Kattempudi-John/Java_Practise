package Phase2.Objects;

public class UserMain {
    public static void main(String[] args) {

        User user1 = new User(101, "John");
        User user2 = new User(101,"John");
        System.out.println(user1);
        System.out.println(user1.hashCode());
        System.out.println(user2);
        System.out.println(user2.hashCode());
        System.out.println(user1.hashCode() == user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
