package TestRunner1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Base_ParentClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber Hook Options:
@CucumberOptions(features = {"src/test/resources/Meta_Feature_Files"},//path of feature file location
plugin = {"json:target/cucumber.json"},
glue="StepDefinition",tags= {"@Cart"})    //tags is used to run specific test cases from FeatureFile

public class TestRunnerClass1 extends AbstractTestNGCucumberTests {

@BeforeTest
public void metaSetup () {
	Base_ParentClass test = new Base_ParentClass();
	test.metaBroswerinit();
}

@AfterTest
 public void metaCloseURL() throws Exception {

	Base_ParentClass test = new Base_ParentClass();
	test.driver.quit();
}
	


}
