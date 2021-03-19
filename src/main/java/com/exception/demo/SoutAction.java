package com.exception.demo;

import org.springframework.stereotype.Component;

@Component
public class SoutAction {

    public void print(final String message) {
        // SOME huge logic
        System.out.println(message);
    }
}
