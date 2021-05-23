package com.nubiform;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MyObjectTest {

    @Spy
    MyObject spyObject;

    @Mock
    MyObject mockObject;

    @Test
    public void spyTest() {
        when(spyObject.getIntValue(anyInt())).thenReturn(50);

        int intValue = spyObject.getIntValue(3);
        assertEquals(50, intValue);

        boolean trueOrFalseValue = spyObject.getTrueOrFalseValue(1);
        assertTrue(trueOrFalseValue);

        List listObject = spyObject.getListObject(1);
        assertNotNull(listObject);

        verify(spyObject, atLeast(1)).getIntValue(anyInt());
        verify(spyObject, atLeast(1)).getTrueOrFalseValue(anyInt());
    }

    @Test
    public void mockTest() {
        when(mockObject.getIntValue(anyInt())).thenReturn(50);

        int intValue = mockObject.getIntValue(3);
        assertEquals(50, intValue);

        boolean trueOrFalseValue = mockObject.getTrueOrFalseValue(1);
        assertFalse(trueOrFalseValue);

        List listObject = mockObject.getListObject(1);
        assertEquals(Collections.emptyList(), listObject);

        verify(mockObject, atLeast(1)).getIntValue(anyInt());
        verify(mockObject, atLeast(1)).getTrueOrFalseValue(anyInt());
    }
}