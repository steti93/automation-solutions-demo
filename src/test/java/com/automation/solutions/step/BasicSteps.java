package com.automation.solutions.step;

import com.automation.solutions.SoutAction;
import com.automation.solutions.action.Tools;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicSteps {

    @Autowired
    private SoutAction soutAction;

    private String messageFromContext;

    @Given("^user prints something$")
    public void userPrint() {
        final String message = "Holla amigos";
        messageFromContext = message;
        soutAction.print(message);
    }

    @Given("following property is printed {}")
    public void followingProperyIsPrinted(String property) {
        soutAction.print(property);
    }

    @When("and user validate following message {string}")
    public void andUserValidateFollowingMessage(final String expectedMessage) {
        assertTrue(messageFromContext.equals(expectedMessage), "Message is correct");
    }

    @When("user see following messages")
    public void userSeeFollowingMessages(List<String> messages) {
        messages.forEach(message -> soutAction.print(message));
    }

    @When("user verify if '{}' is odd and positive number")
    public void userVerifyIfIsOddNumber(int numberToVerify) {
        boolean numberIsOdd = Tools.isOddAndPositive(numberToVerify);
        assertTrue(numberIsOdd, "Number is not odd or positive");
    }
}
