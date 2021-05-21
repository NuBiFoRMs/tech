package com.nubiform;

public class EventService {

    public EventService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    private final EmailSender emailSender;

    public Event createEvent(String title) {
        Event event = new Event();
        event.setTitle(title);

        return event;
    }

    public boolean sendEmailEvent(Event event) {
        return emailSender.send(event.getTitle());
    }
}
