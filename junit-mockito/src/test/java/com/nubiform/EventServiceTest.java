package com.nubiform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventServiceTest {

    EventService eventService;

    @BeforeEach
    public void setUp() {
        // arrange
        eventService = new EventService();
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