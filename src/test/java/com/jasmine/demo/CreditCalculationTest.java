package com.jasmine.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/swagger.feature", 
		plugin = {"pretty", "html:target/cucumber"},
		glue=""
		)
public class CreditCalculationTest {

	
}
