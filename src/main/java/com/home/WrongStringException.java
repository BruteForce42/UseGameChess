package com.home;

public class WrongStringException extends Exception {
    public String toString() {
        return "You entered an incorrect string";
    }
}