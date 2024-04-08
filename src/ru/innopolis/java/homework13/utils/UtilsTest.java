package ru.innopolis.java.homework13.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void testParseCountValid() {
        String validValue = "10";
        assertEquals(10, Utils.parseCount(validValue));
    }

    @Test
    void testParseCountInvalid() {
        String invalidValue = "abc";
        assertThrows(IllegalArgumentException.class, () -> Utils.parseCount(invalidValue));
    }

    @Test
    void testValidateCountPositive() {
        int positiveValue = 5;
        assertEquals(5, Utils.validateCount(positiveValue));
    }

    @Test
    void testValidateCountZero() {
        int zeroValue = 0;
        assertThrows(IllegalArgumentException.class, () -> Utils.validateCount(zeroValue));
    }

    @Test
    void testParseNumberValid() {
        String validValue = "3.14";
        assertEquals(3.14, Utils.parseNumber(validValue));
    }

    @Test
    void testParseNumberInvalid() {
        String invalidValue = "xyz";
        assertThrows(IllegalArgumentException.class, () -> Utils.parseNumber(invalidValue));
    }

    @Test
    void testValidateNumberFinite() {
        double finiteValue = 10.5;
        assertEquals(10.5, Utils.validateNumber(finiteValue));
    }

    @Test
    void testValidateNumberNaN() {
        double nanValue = Double.NaN;
        assertThrows(IllegalArgumentException.class, () -> Utils.validateNumber(nanValue));
    }

    @Test
    void testValidateNumberInfinite() {
        double infiniteValue = Double.POSITIVE_INFINITY;
        assertThrows(IllegalArgumentException.class, () -> Utils.validateNumber(infiniteValue));
    }
}