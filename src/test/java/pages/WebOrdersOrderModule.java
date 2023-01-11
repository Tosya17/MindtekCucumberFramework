package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebOrdersOrderModule {
    public  WebOrdersOrderModule(){
        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement priceBox;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discountBox;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement totalBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement nameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement ccBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expDateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadioButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//strong")
    public WebElement successMessage;
}
