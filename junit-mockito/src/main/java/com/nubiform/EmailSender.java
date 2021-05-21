package com.nubiform;

public class EmailSender implements NotificationSender {

    public boolean send(String content) {
        System.out.println("send email: " + content);
        return true;
    }
}
