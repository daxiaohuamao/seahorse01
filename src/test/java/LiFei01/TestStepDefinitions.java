package LiFei01;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TestStepDefinitions{
    protected static WebDriver driver;
     public void WaitTime(){
         try{
             Thread.currentThread().sleep(1000);
         }catch(InterruptedException ie){
             ie.printStackTrace();
         }
     }


    @Before
    public void setUp() {

        DesiredCapabilities cap = new DesiredCapabilities();

        driver = WebDriverProvider.createWebDriver(cap);

    }

    @Given("^a website named telstra register")
    public void GivenAWebsite() {
      //  driver.get("http://www.baidu.com");
    }

    @When("^I open the link (.*)")
    public void OpenTelstra(String word) {
         driver.navigate().to("http://localhost:9500/register");
        //driver.navigate().to("http://www.xidian.edu.cn/");

         //WebElement element =driver.findElement(By.id("email"));
         //element.sendKeys(word);
         //WaitTime();

         //element.submit();
         //WaitTime();


         //driver.findElement(By.linkText("贴吧")).click();
         //WaitTime();
         //driver.quit();
    }

    @Then("^I should see the page")
    public void CheckPage() {
        assertThat(driver.getTitle(), is("Register - My Account - Telstra - Telstra"));
    }

    @When("^write your email (.*)")
    public void RegisterEmail(String word) {

        WebElement element =driver.findElement(By.id("email"));
        element.sendKeys(word);
        WaitTime();

        element.submit();

    }
    @When("^write your password (.*)")
    public void RegisterPassword(String word) {

        WebElement element =driver.findElement(By.id("password"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }
    @When("^re-enter your password (.*)")
    public void ReRegisterPassword(String word) {

        WebElement element =driver.findElement(By.id("passwordConfirm"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }
    @When("^write your first name (.*)")
    public void RegisterFirstName(String word) {

        WebElement element =driver.findElement(By.id("firstName"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }

    @When("^write your last name (.*)")
    public void RegisterLastName(String word) {

        WebElement element =driver.findElement(By.id("lastName"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }

    @When("^write your birthday day (.*)")
    public void RegisterBirthdayDay(String word) {

        WebElement element =driver.findElement(By.id("dateDay"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }
    @When("^write your birthday month (.*)")
    public void RegisterBirthdayMonth(String word) {

        WebElement element =driver.findElement(By.id("dateMonth"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }
    @When("^write your birthday year (.*)")
    public void RegisterBirthdayYear(String word) {

        WebElement element =driver.findElement(By.id("dateYear"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }
    @When("^write your telstra numbers (.*)")
    public void RegisterTelstraNum(String word) {

        WebElement element =driver.findElement(By.id("accountIdentifier"));
        element.sendKeys(word);
        WaitTime();
        element.submit();
    }

}
