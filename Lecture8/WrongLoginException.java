package com.Lecture8;

public class WrongLoginException extends Exception{

    WrongLoginException(){

    }

    WrongLoginException (String message) {
        super(message);
    }
}
