package Phase2.MeetingProject;

public class MeetingObject {

    public static void main(String[] args) {

        User user = new User(
                101,
                "John",
                "john@gmail.com",
                "Hsr@1234");

        user.displayUserDeatils();

        Meeting meeting = new Meeting(
                101,
                "Java interview",
                user);

        meeting.displayMeetingDetails();
        meeting.startMeeting(user);

        Notification notification = new Notification("Join the intervuew", user);
        notification.sendNotification();

        meeting.endMeeting(user);

    }



}
