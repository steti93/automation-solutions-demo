package com.exception.demo.step;

import io.cucumber.java.en.Given;

public class BasicSteps {

    @Given("^user prints something$")
    public void userPrint() {
        System.out.printf("Holla amigos");
    }
}
