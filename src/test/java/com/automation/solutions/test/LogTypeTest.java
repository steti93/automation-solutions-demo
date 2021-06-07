package com.automation.solutions.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogTypeTest {
    private static final Logger log = LoggerFactory.getLogger(LogTypeTest.class);

    @Test
    public void typeOfLogging() {
        log.error("Error type log");
        log.debug("More informative granular type log");
        log.warn("A Warning error message");
        log.info("Test has passed with success!");
    }
}
