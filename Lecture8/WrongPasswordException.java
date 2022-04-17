package com.Lecture8;

public class WrongPasswordException extends Exception{

    WrongPasswordException () {

    }

    WrongPasswordException (String message) {
        super(message);
    }
}
