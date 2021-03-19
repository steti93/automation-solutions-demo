package com.exception.demo.test;

import com.exception.demo.action.Tools;
import com.exception.demo.exception.EmptyFileExeption;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.util.Objects;

public class DifferenceThrowAndThrows {

    private static final Logger log = LoggerFactory.getLogger(DifferenceThrowAndThrows.class);

    @Test
    public void throwAnException() {
        final int validateNumber = 2;
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
    public void customException() {
        try {
            Tools.isOddAndPositive(null);
        } catch (EmptyFileExeption ex) {
            System.out.println("Number is null");
            System.out.println(ex.getMessage());
        }
        finally
        {
            Tools.isOddAndPositive(0);
        }
    }

    @Test
    public void catchException() {
        String resourceLocation = "classpath:data/file.txt";
        try {
            ResourceUtils.getFile(resourceLocation);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file: " + resourceLocation + " is not found");
            fileNotFoundException.printStackTrace();
        } finally {
            log.info("Tried to read file: {}", resourceLocation);
        }

    }
}
