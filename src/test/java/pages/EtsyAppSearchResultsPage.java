package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsyAppSearchResultsPage {

    public EtsyAppSearchResultsPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//div/ol/li/div/div/a/div[2]/h3")
    public List<WebElement> listOfItemsTitles;

    @FindBy(xpath = "//span[@class=\"wt-hide-xs wt-show-md filter-expander\"]")
    public WebElement filterButton;

    @FindBy(xpath = "//label[contains(text(),'Over $1,500')]")
    public WebElement filterRadioButtonOver1500;

    @FindBy(xpath = "//label[contains(text(),'Under $250')]")
    public WebElement filterRadioButtonUnder250;

    @FindBy(xpath = "//label[contains(text(),'Under $250 to $750')]")
    public WebElement filterRadioButton250to750;

    @FindBy(xpath = "//label[contains(text(),'Under $500 to $1,000')]")
    public WebElement filterRadioButton500to1000;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    public WebElement applyButton;

    @FindBy(xpath = "//div[@class='wt-bg-white wt-display-block wt-pb-xs-2 wt-mt-xs-0']//span[@class='currency-value']")
    public List<WebElement> listOfItemsPrices;



}
