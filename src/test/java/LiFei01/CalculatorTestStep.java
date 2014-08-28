/*
package LiFei01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTestStep {
    //private String result;
    private Calculator Calculator;
    private int result;

    @Given("a calculator")
    public void isTest() {
        this.Calculator = new Calculator();
    }

    @When("^Use (.*) add (.*)")
    public int Ad(int num1, int num2) {
        this.result = Calculator.add(num1, num2);
        return result;
    }

    @Then("^The add result is (.*)")
    public void AddResult(int re) {
        assertThat(result, is(re));
    }

    @When("^Use (.*) minus (.*)")
    public int Mi(int num1,int num2){
        this.result = Calculator.minus(num1, num2);
        return result;
    }

    @Then("^The minus result is (.*)")
    public void MinusResult(int re){
        assertThat(result, is(re));
    }

    @When("^Use (.*) multi (.*)")
    public int Mu(int num1,int num2){
        this.result = Calculator.multi(num1, num2);
        return result;

    }

    @Then("^The multi result is (.*)")
    public void MultiResult(int re){
        assertThat(result, is(re));
    }

    @When("^Use (.*) devi (.*)")
    public int De(int num1,int num2){
        this.result = Calculator.devi(num1, num2);
        return result;

    }
    @Then("^The devi result is (.*)")
    public void DeviResult(int re){
        assertThat(result, is(re));
    }

}
*/
