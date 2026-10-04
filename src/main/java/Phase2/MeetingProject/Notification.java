package Phase2.MeetingProject;

public class Notification {

    private final String message;
    private final User receiver;

    public  Notification(String message, User receiver) {
        this.message = message;
        this.receiver = receiver;
    }

    public void sendNotification() {
        System.out.println("Sending notification");
    }

}
