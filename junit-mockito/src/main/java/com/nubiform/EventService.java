package com.nubiform;

public class EventService {

    public Event createEvent(String title) {
        Event event = new Event();
        event.setTitle(title);

        return event;
    }

    public boolean sendEmailEvent(Event event) {
        EmailSender emailSender = new EmailSender();
        return emailSender.send(event.getTitle());
    }
}
