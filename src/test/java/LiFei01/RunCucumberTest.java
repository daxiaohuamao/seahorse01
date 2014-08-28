package LiFei01;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty"},
        tags = {"~@manual"})
public class RunCucumberTest {
}