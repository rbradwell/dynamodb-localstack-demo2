package com.example.demo.exception;

public class UnableToFindItemInfoException extends RuntimeException{

    public UnableToFindItemInfoException(String fileName) {
        super("Unable to find file with name: " + fileName);
    }

}
