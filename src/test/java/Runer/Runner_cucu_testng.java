package Runer;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/VermeerFeatures/FileUpoladMachineCliam.feature",
				 glue = { "VerSteps"},
				 dryRun = false,
				 plugin = {"pretty",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
						  })
public class Runner_cucu_testng extends AbstractTestNGCucumberTests {

}
