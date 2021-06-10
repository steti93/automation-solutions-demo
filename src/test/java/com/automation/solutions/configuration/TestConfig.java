package com.automation.solutions.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.automation.solutions"})
@EnableAspectJAutoProxy
public class TestConfig {
}
