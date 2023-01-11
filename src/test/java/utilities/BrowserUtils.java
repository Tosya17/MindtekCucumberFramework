package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class BrowserUtils {

    /**
     *  This method will accept WebElement of dropdown
     *  and String value of dropdown, and will select
     *  provided value in dropdown.
     */
    public static void selectDropdownByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * This method will accept WebElement of dropdown
     * and String visible text of dropdown, and will select
     * provided text in dropdown.
     */
    public static void selectDropdownByVisibleText(WebElement element, String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public static void selectDropdownByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /**
     *  This method takes screenshots.
     *  Ex:
     *      takeScreenshot("SauceDemo Test")
     */
    public static void takeScreenshot(String testName) throws IOException {
        WebDriver driver = Driver.getDriver();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path = "src/test/resources/screenshots/"+testName+".png";
        File file = new File(path);
        FileUtils.copyFile(screenshot, file);
    }

    /**
     *  This method generates random emails.
     *  Ex:
     *      getRandomEmail(); -> returns testUser647381@gmail.com
     */
    public static String getRandomEmail(){
        String username = "user";
        UUID uuid = UUID.randomUUID();
        return username+uuid+"@gmail.com";
    }

    /**
     *  This method generates very strong password
     *  Ex:
     *      getRandomStrongPassword(); -> returns random very strong  password
     */
    public static String getRandomStrongPassword(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
