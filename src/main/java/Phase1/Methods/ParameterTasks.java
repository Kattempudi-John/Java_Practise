package Phase1.Methods;

public class ParameterTasks {
    public static void showStudent(String studentName){
        System.out.println("Student Name: " + studentName);
    }

    public static void registerUser(String email, String password){
        validateUser(email);
        saveUser(email);
        System.out.println("Register User");

    }
    public static void validateUser(String email){
        System.out.println("Validating the User");
    }

    public static void saveUser(String email){
        System.out.println("Saving User");
    }

    public static void main(String[] args) {
        showStudent("John");
        registerUser("john@gmail.com","Hsr@1234");
    }
}
