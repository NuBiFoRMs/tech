package com.nubiform;

public class App {

    public static void main(String[] args) {
        String eventTitle = "My event";

        EventService eventService = new EventService();

        // create event
        Event event = eventService.createEvent(eventTitle);

        // send email
        if (eventService.sendEmailEvent(event)) {
            System.out.println("성공적으로 발송되었습니다.");
        }
        else {
            System.out.println("발송에 실패 하였습니다.");
        }
    }
}
