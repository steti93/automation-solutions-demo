package com.automation.solutions.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import io.cucumber.java.Scenario;
import org.springframework.stereotype.Component;

/**
 * CucumberScenarioAppender appends logs to the current cucumber scenario output
 */
@Component
public class CucumberScenarioAppender extends AppenderBase<ILoggingEvent> {

    private Scenario getScenario() {
        return StaticSpringContext.getBean(CucumberScenarioContext.class).getCurrentScenario();
    }

    @Override
    protected void append(ILoggingEvent iLoggingEvent) {
        Scenario cukeScenario = getScenario();
        if (cukeScenario != null)
            cukeScenario.log(iLoggingEvent.getFormattedMessage());
    }
}
