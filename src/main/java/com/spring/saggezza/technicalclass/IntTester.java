package com.spring.saggezza.technicalclass;

public class IntTester implements IIntTester {
    public boolean isInteger(String inputNumber) {

        try {
            Integer.parseInt(inputNumber);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
