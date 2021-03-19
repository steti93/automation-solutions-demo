package com.exception.demo;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Log4j2
public class StepArgumentAspect {

    @Pointcut("@annotation(io.cucumber.java.en.Given)")
    public void givenStepPointCut() {
    }

    @Pointcut("@annotation(io.cucumber.java.en.When)")
    public void whenStepPointCut() {
    }

    @Pointcut("@annotation(io.cucumber.java.en.Then)")
    public void thenStepPointCut() {
    }

    @Pointcut("@annotation(io.cucumber.java.en.And)")
    public void andStepPointCut() {
    }

    @Pointcut("@annotation(io.cucumber.java.en.But)")
    public void butStepPointCut() {
    }

    @Around("givenStepPointCut() || whenStepPointCut()||thenStepPointCut()||andStepPointCut()||butStepPointCut()")
    public Object processStepArguments(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        StopWatch stopWatch = new StopWatch(className + "->" + methodName);
        stopWatch.start(methodName);
        Object result = joinPoint.proceed();
        stopWatch.stop();

        log.info(stopWatch.shortSummary());

        return result;
    }
}
