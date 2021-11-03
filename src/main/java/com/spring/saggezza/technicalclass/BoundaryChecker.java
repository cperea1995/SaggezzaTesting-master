package com.spring.saggezza.technicalclass;

public class BoundaryChecker implements IBoundaryChecker {
    public boolean isInsideBoundary (int number) {
        if (number >= 1 && number <= 300) {
            return true;
        }
        return false;
    }
}
