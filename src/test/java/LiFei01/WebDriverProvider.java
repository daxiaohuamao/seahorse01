package LiFei01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverProvider {


        public static WebDriver createWebDriver(DesiredCapabilities cap) {
            boolean useWebDriver = Boolean.parseBoolean(System.getProperty("use-chrome-webdriver"));

            return new ChromeDriver(cap);

        }


}
