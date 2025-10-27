package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testPass() {
        assertEquals(4, 2 + 2); // ✅ This test will pass
    }

    @Test
    void testFail() {
        assertEquals(10, 5 + 2); // ❌ This test will fail (to show Failure = 1)
    }
}


