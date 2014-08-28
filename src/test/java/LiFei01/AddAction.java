/*
package LiFei01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AddAction {
    private Calculator Calculator;
    private int result;

    @Given("a add calculator")
    public void isTest() {
        this.Calculator = new Calculator();
    }

    @When("^(.*) add (.*)")
    public int Ad(int num1, int num2) {
        this.result = Calculator.add(num1, num2);
        return result;
    }

    @Then("^The result is (.*)")
    public void AddResult(int re) {
        assertThat(result, is(re));
    }

}
*/
