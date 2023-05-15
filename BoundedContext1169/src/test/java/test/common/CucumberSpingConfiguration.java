package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.BoundedContext1169Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1169Application.class })
public class CucumberSpingConfiguration {}
