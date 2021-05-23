package com.nubiform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EventServiceTest {

    @Mock
    EmailSender emailSender;

    @InjectMocks
    EventService eventService;

    @BeforeEach
    public void setUp() {

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
        when(emailSender.send(anyString())).thenReturn(true);

        Event event = new Event();
        event.setTitle("Test Title");

        // act
        boolean result = eventService.sendEmailEvent(event);

        // assert
        assertTrue(result);
        verify(emailSender, times(1)).send(anyString());
    }
}