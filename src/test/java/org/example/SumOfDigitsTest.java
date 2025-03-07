package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    @Test
    void testInitialImplementation() {
        SumOfDigits sumDigits = new SumOfDigits();
        assertEquals(1, sumDigits.sumDigits(1));
    }
}
