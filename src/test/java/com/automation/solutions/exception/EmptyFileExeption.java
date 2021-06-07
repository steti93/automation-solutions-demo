package com.automation.solutions.exception;

public class EmptyFileExeption extends RuntimeException {

    public EmptyFileExeption() {
        super();
    }

    public EmptyFileExeption(String exeptionMesage) {
        super(exeptionMesage);
    }

}
