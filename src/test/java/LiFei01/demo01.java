/*
package LiFei01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class demo01 {

        private String result;

        @Given("a key")
        public void isTest(){
        }

        @When("^I visit (.*)")
        public String input(String url) throws IOException {
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setRequestMethod("HEAD");
            conn.getResponseCode();
            if(conn.getResponseCode()==200)  //正常访问情况
                result = "1";
              else result="0";
            return result;

        }

        @When("^I choose (.*)")
        public String check(String url) throws IOException {
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setRequestMethod("HEAD");
            conn.getResponseCode();
            if(conn.getResponseCode()==200)  //正常访问情况
                result = "1";
            else result="0";
            return result;
        }

        @Then("^I should check the url")
        public void outPut(){
            assertThat(result, is("1"));
        }

}




*/
