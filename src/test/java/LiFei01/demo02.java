/*
package LiFei01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class demo02 {
    private String result;
//    private int i=2;   // private int result;
    @Given("a url")
    public void isTest(){
    }

    @When("^I use (.*)")
    //public String check(String url) throws IOException {
    public String check(String url) throws IOException {
        URL u = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        conn.setRequestMethod("HEAD");
        conn.getResponseCode();
        if(conn.getResponseCode()==200)  //正常访问情况
            result = "1";
            // result=1;
        else result="0";
            // result=0;
        return result;
    }

    @Then("^I check the url")
    public void outPut() {
        assertThat(result, is("1"));
        //if(result==2)
        //assertThat(i, is(4));
        // assert i==1;
               //  return true;
        //return false;

    }


}
*/
