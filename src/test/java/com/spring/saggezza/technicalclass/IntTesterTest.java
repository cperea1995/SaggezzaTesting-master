package com.spring.saggezza.technicalclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntTesterTest {


    private IIntTester intTester;

    @BeforeEach
    void setup() {
        this.intTester = new IntTester();
    }

    @Test
    void given1GetTrue() {
        // Given: I am a user


        // When: I enter the string 1
        boolean result = intTester.isInteger("1");

        // Then: I get back true
        assertTrue(result);
    }

    @Test
    void given2GetTrue() {
        // Given: I am a user

        // When: I enter the string 2
        boolean result = intTester.isInteger("2");

        // Then: I get back true
        assertTrue(result);
    }

    @Test
    void givenDadGetFalse() {
        // Given: I am a user

        // When: I enter the string Dad
        boolean result = intTester.isInteger("Dad");

        // Then: I get back false
        assertFalse(result);
    }

    @Test
    void givenMomGetFalse() {
        // Given: I am a user

        // When: I enter the string Mom
        boolean result = intTester.isInteger("Mom");

        // Then: I get back false
        assertFalse(result);
    }

    @Test
    void givenDoubleGetFalse() {
        // Given: I am a user

        // When: I enter a string 2.5
        boolean result = intTester.isInteger("2.5");

        // Then: I get back false
        assertFalse(result);
    }

    @Test
    void givenAnotherDoubleGetFalse() {
        // Given: I am a user

        // When: I enter a string 3.7
        boolean result = intTester.isInteger("3.7");

        // Then: I get back false
        assertFalse(result);
    }

    @Test
    void givenNegativeNumberGetTrue() {
        // Given: I am a user

        // When: I enter the string -4
        boolean result = intTester.isInteger("-4");

        // Then: I get back true
        assertTrue(result);
    }

    @Test
    void givenAnotherNegativeNumberGetTrue() {
        // Given: I am a user

        // When: I enter the string -11
        boolean result = intTester.isInteger("-11");

        // Then: I get back true
        assertTrue(result);
    }

}
