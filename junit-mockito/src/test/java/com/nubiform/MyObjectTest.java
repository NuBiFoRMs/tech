package com.nubiform;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import sun.jvm.hotspot.gc_interface.GCWhen;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

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
    }

    @Test
    public void mockTest() {
        when(mockObject.getIntValue(anyInt())).thenReturn(50);

        int intValue = mockObject.getIntValue(3);
        assertEquals(50, intValue);

        boolean trueOrFalseValue = mockObject.getTrueOrFalseValue(1);
        assertFalse(trueOrFalseValue);
    }
}