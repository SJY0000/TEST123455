package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.VideoprocessingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoprocessingApplication.class })
public class CucumberSpingConfiguration {}
