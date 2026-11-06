
package com.example.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    EvenOdd obj = new EvenOdd();

    @Test
    public void testEvenNumber() {
        assertEquals("Even", obj.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", obj.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", obj.checkEvenOdd(0));
    }
}
