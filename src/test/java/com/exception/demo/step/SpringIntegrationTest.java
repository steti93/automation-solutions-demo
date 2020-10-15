package com.exception.demo.step;

import com.exception.demo.configuration.TestConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {TestConfig.class})
@SpringBootTest
public class SpringIntegrationTest {
}
