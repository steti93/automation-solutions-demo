package com.automation.solutions;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json"
)
@CucumberOptions(
        features = "src/test/resources",
        tags = "not @Ignore",
        plugin = {"json:target/cucumber.json"})
public class RunTests {

}
