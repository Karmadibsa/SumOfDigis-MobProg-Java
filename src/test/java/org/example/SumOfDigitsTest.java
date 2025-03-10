package org.example;

//- Pour l'entrée 123, la sortie devrait être 6 (1+2+3)
//- Pour l'entrée 9875, la sortie devrait être 29 (9+8+7+5)
//- Pour l'entrée 0, la sortie devrait être 0
//- Étape 2 : Faire en sorte que l'addition des chiffres continue jusqu'a que la sortie sois un seul chiffres.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class
SumOfDigitsTest {

    @Test
    void testInitialImplementation() {
        assertEquals(0, SumOfDigits.calculFinalDigits(0));
    }
    @Test
    void test11Return2() {
        assertEquals(1, SumOfDigits.calculFinalDigits(11));
    }

    @Test
    void test123Return6() {
        assertEquals(6, SumOfDigits.calculFinalDigits(123));
    }

    @Test
    void test9875Return2() {
        assertEquals(3, SumOfDigits.calculFinalDigits(9876));
    }

    @Test
    void test543216Return2() {
        assertEquals(3, SumOfDigits.calculFinalDigits(543216));
    }

    @Test
    void test9Return9() {
        assertEquals(9, SumOfDigits.calculFinalDigits(9));
    }

    @Test
    void test13Return3() {
        assertEquals(3, SumOfDigits.calculFinalDigits(13));
    }
}
