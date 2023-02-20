package group1.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "group1" }, features = "src/test/resources/features", plugin = { "json:target/cucumber-reports/cucumber.json" }, tags = { "@dev,@wip" })
public class DevTests {
}
