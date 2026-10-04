package Phase1.Methods;

public class StudentManagement {
    public static void checkDuplicateMail(){
        System.out.println("Email validated");
    }
    public static void validateUser(){
        System.out.println("Validating the User");
        checkDuplicateMail();
    }

    public static void sendWelcomeMail(){
        System.out.println("Welcome to Portal");
    }

    public static void saveUser(){
        validateUser();
        System.out.println("Saving User");
        sendWelcomeMail();
    }

    public static void main(String[] args) {
        saveUser();
    }
}
