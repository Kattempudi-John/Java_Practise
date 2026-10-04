package Phase2.MeetingProject;

public class Meeting {

    private int meetingId;
    private String title;
    private User host;
    private boolean started;

    public Meeting(int meetingId, String title, User host) {
        this.meetingId = meetingId;
        this.title = title;
        this.host = host;
        this.started = false;
    }

    public void startMeeting(User user) {
        if (this.host.equals(user)) {
            this.started = true;
            System.out.println("Meeting started");
        } else{
            System.out.println("Only host can start meeting");
        }
    }

    User endMeeting(User user) {
       return user;
    }

    void displayMeetingDetails() {

        System.out.println("Meeting ID: " + meetingId);
        System.out.println("Title: " + title);
        System.out.println("Host: " + host);
        System.out.println("Started: " + started);
    }
}
