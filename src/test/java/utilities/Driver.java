package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    /**
     * This method sets up WebDriver type based on
     * provided browser type in Configuration.properties file.
     * @return WebDriver
     */

    public static WebDriver getDriver(){
        String browser = ConfigReader.getProperty("browser");
        if (driver==null || ((RemoteWebDriver)driver).getSessionId()==null){
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions optionsChrome = new ChromeOptions();
                    optionsChrome.setHeadless(false);
                    driver = new ChromeDriver(optionsChrome);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions optionsFF = new FirefoxOptions();
                    optionsFF.setHeadless(false);
                    driver = new FirefoxDriver(optionsFF);
                    break;
            }
        } else {
            return driver;
        }
        return driver;
    }
}
