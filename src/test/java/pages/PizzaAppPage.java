package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PizzaAppPage {
    public  PizzaAppPage(){
        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "pizza1Pizza")
    public WebElement pizzaDropdown;

    @FindBy(css = ".toppings1")
    public WebElement topping1Dropdown;

    @FindBy(css = ".toppings2")
    public WebElement topping2Dropdown;

    @FindBy(id = "pizza1Qty")
    public WebElement pizzaQtyBox;

    @FindBy(id = "pizza1Cost")
    public WebElement pizzaCostBox;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "phone")
    public WebElement phoneBox;

    @FindBy(id = "cashpayment")
    public WebElement cashRadioButton;

    @FindBy(id = "placeOrder")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//p")
    public WebElement successMessage;

    @FindBy(id = "dialog")
    public WebElement dialogWindow;

    @FindBy(id = "ccpayment")
    public WebElement creditCardRadioButton;

}
