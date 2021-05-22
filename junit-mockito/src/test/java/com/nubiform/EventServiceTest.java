package com.nubiform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class EventServiceTest {

    EmailSender emailSender = Mockito.mock(EmailSender.class);

    EventService eventService;

    @BeforeEach
    public void setUp() {
        when(emailSender.send(anyString())).thenReturn(true);

        // arrange
        eventService = new EventService(emailSender);
    }

    @Test
    public void createEvent() {
        String testTitle = "Test Title";

        // act
        Event event = eventService.createEvent(testTitle);

        // assert
        assertEquals(testTitle, event.getTitle());
    }

    @Test
    public void sendEmailEvent() {
        Event event = new Event();
        event.setTitle("Test Title");

        // act
        boolean result = eventService.sendEmailEvent(event);

        // assert
        assertTrue(result);
    }
}