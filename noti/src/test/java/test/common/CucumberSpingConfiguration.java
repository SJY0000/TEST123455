package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.NotiApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotiApplication.class })
public class CucumberSpingConfiguration {}
