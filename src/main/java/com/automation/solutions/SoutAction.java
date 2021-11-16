package com.automation.solutions;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class SoutAction {

    public void print(final String message) {
        log.info(message);
    }
}
