package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.DriveApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriveApplication.class })
public class CucumberSpingConfiguration {}
