package com.nubiform;

public class EventService {

    private final NotificationSender notificationSender;

    public EventService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public Event createEvent(String title) {
        Event event = new Event();
        event.setTitle(title);

        return event;
    }

    public boolean sendEmailEvent(Event event) {
        return notificationSender.send(event.getTitle());
    }
}
