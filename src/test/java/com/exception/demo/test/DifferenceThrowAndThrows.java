package com.exception.demo.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

public class DifferenceThrowAndThrows {

    private static final Logger log = LoggerFactory.getLogger(DifferenceThrowAndThrows.class);

    @Test
    public void throwAnException() {
        final int validateNumber = 4;
        switch (validateNumber) {
            case 1:
            case 2:
            case 3:
                log.info("Correct value : {}", validateNumber);
                break;
            default:
                throw new RuntimeException(String.format("Invalid parameter: %s", validateNumber));
        }
    }

    @Test
    public void exceptionOnMethodSignature() throws FileNotFoundException {
        ResourceUtils.getFile("classpath:data/invalidFile");
    }

    @Test
    public void catchException() {
        try {
            ResourceUtils.getFile("classpath:data/invalidFile");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
