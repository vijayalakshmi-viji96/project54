package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testFailExample() {
        int expected = 5;
        int actual = 3;
        assertEquals("Intentional failure for testing Jenkins", expected, actual);
    }
}

