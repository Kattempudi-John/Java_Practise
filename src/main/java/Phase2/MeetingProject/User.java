package Phase2.MeetingProject;

public class User {

    private final int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private boolean status;

    public User(int userId, String userName, String userEmail, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.status = true;
    }

    public void changeName(String userName){
        this.userName = userName;
    }

    public void deactiveteUser(){
        this.status = false;
    }

    void displayUserDeatils(){

        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("User Email: " + userEmail);
        System.out.println("User Status: " + status);
    }
}
