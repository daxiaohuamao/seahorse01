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

public class demo{

        //private String action;

        //private String subject;

        private String result;

        @Given("a key")

        public void isTest(){

            //this.action = action;

        }

        @When("^I visit (.*)")

        public String input(String url) throws IOException {

           // this.subject = subject;
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

            //Assert.assertEquals(action + subject, gretting);
            assertThat(result, is("1"));


        }



}




