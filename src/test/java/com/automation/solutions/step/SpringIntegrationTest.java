package com.automation.solutions.step;

import com.automation.solutions.configuration.TestConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {TestConfig.class})
@SpringBootTest
public class SpringIntegrationTest {
}
