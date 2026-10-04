package Phase2.classeAndObjects;

import java.time.LocalDateTime;

public class Meeting {
        int meetingId;
        String title;
        String host;
        LocalDateTime startTime;
        LocalDateTime endTime;
        boolean status;

    public void startMeeting(){
        System.out.println("Starting Meeting" + startTime);

    }

    public void endMeeting(){
        System.out.println("Ending Meeting" + endTime);
    }

    public void displayMeetingDetails(){
        System.out.println("Meeting Details:");
        System.out.println("MeetingId" + meetingId);
        System.out.println("Title" + title);
        System.out.println("Host" + host);
        System.out.println("StartTime" + startTime);
        System.out.println("EndTime" + endTime);
        System.out.println("Status" + status);
    }
}
