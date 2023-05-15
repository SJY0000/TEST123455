package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.IndexerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexerApplication.class })
public class CucumberSpingConfiguration {}
