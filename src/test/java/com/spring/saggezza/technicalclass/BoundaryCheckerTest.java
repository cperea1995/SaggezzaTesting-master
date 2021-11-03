package com.spring.saggezza.technicalclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BoundaryCheckerTest {

    private IBoundaryChecker boundaryChecker;

    @BeforeEach
    public void setup() {
        this.boundaryChecker = new BoundaryChecker();
    }

    @Test
    public void userEnters0GetFalse() {
        // Given: I am a user
        // When: I enter the number 0
        boolean result = boundaryChecker.isInsideBoundary(0);
        // Then: I get back FALSE
        assertFalse(result);
    }

    @Test
    public void userEnters301GetFalse() {
        // Given: I am a user
        // When: I enter the integer 301
        boolean result = boundaryChecker.isInsideBoundary(301);
        // Then: I get back FALSE
        assertFalse(result);
    }

    @Test
    public void userEnters1GetTrue() {
        // Given: I am a user
        // When: I enter the integer 1
        boolean result = boundaryChecker.isInsideBoundary(1);
        // Then: I get back TRUE
        assertTrue(result);
    }

    @Test
    public void userEnters300GetTrue() {
        // Given: I am a user
        // When: I enter the integer 300
        boolean result = boundaryChecker.isInsideBoundary(300);
        // Then: I get back TRUE
        assertTrue(result);
    }
}
