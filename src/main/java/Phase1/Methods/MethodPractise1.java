package Phase1.Methods;

public class MethodPractise1 {
    public static void showCompanyName(){
        System.out.println("ABC technologies");
    }
    public static void connectingDatabase(){
        System.out.println("Database connected");
    }

    public static void startServer(){
        System.out.println("Server started");
        connectingDatabase();
    }

    public static void createStudent(){
        System.out.println("Creating student");
    }

    public static void validateOrder(){
        System.out.println("Validating order");
    }

    public static void saveOrder(){
        System.out.println("Saving order");
    }

    public static void createOrder(){
        System.out.println("Creating order");
        validateOrder();
        saveOrder();
    }
    public static void main(String[] args) {
        showCompanyName();
        startServer();
        createStudent();
        createStudent();
        createStudent();
        createOrder();
    }
}
