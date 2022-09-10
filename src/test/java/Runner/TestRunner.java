package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;





@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/HelloWorld.feature"} , 
glue= "StepsK",
tags= ("@Regression or @smoke" ),
plugin= {"pretty", "html:target/cucumberreports.html"},
monochrome=true
		)

public class TestRunner  extends AbstractTestNGCucumberTests {
}
