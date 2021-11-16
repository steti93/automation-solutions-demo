package com.automation.solutions.hook;

import com.automation.solutions.appender.CucumberScenarioContext;
import com.automation.solutions.configuration.TestConfig;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@CucumberContextConfiguration
@ContextConfiguration(classes = {TestConfig.class},
        loader = AnnotationConfigContextLoader.class)
public class GeneralHook {

    @Autowired
    private CucumberScenarioContext scenarioContext;

    @Before(order = 0)
    public void loggerSetup(Scenario scenario) {
        scenarioContext.setCurrentScenario(scenario);
    }
}
