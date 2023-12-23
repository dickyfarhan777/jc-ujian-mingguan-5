package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {
    private WebDriver driver;
    public AddCartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cart;
    @FindBy(xpath = "//span[contains(@class, 'title')]")
    private WebElement txtMyCart;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement product1;
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
    private WebElement txtProduct1;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement product2;
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    private WebElement txtProduct2;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckout;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement txtCheckout;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
    private WebElement postalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;
    @FindBy(xpath = "//span[contains(@class, 'title')]")
    private WebElement txtCheckoutOverview;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;
//    @FindBy(xpath = "//div[@class='inventory_item_price'][normalize-space()='$15.99']")
//    private WebElement txtPriceProduct1;
//    @FindBy(xpath = "//div[@class='inventory_item_price'][normalize-space()='$49.99']")
//    private WebElement txtPriceProduct2;
    @FindBy(xpath = "//div[normalize-space()='Payment Information']")
    private WebElement txtPaymentInfo;
    @FindBy(xpath = "//div[normalize-space()='SauceCard #31337']")
    private WebElement txtNameCard;
    @FindBy(xpath = "//div[normalize-space()='Shipping Information']")

    private WebElement txtShippingInfo;
    @FindBy(xpath = "//div[normalize-space()='Free Pony Express Delivery!']")
    private WebElement txtNameShipping;
    @FindBy(xpath = "//span[contains(@class, 'title')]")
    private WebElement txtYourInformation;
    @FindBy(xpath = "//div[normalize-space()='Price Total']")
    private WebElement txtPriceTotal;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement txtTotalItem;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement txtTax;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement txtTotal;

    @FindBy(xpath = "//span[contains(@class, 'title')]")
    private WebElement txtCheckoutComplete;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement txtThankForOrder;


    public void clickProduct1(){
        product1.click();
    }
    public void clickProduct2(){
        product2.click();
    }
    public void clickCart(){
        cart.click();
    }
    public void clickCheckOut(){
        btnCheckout.click();
    }
    public void yourInformation(String firstName, String lastName, String postalCode){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.postalCode.sendKeys(postalCode);
    }
    public void clickBtnContinue(){
        btnContinue.click();
    }
    public void clickBtnFinish(){
        btnFinish.click();
    }


    public String getTxtMyCart(){
        return txtMyCart.getText();
    }
    public String getTxtProduct1(){
        return txtProduct1.getText();
    }
    public String getTxtProduct2(){
        return txtProduct2.getText();
    }
    public String getTxtCheckoutOverview(){
        return txtCheckoutOverview.getText();
    }
//    public String getTxtPriceProduct1(){
//        return txtPriceProduct1.getText();
//    }
//    public String getTxtPriceProduct2(){
//        return txtPriceProduct2.getText();
//    }
    public String getTxtYourInformation(){
        return txtYourInformation.getText();
    }
    public String getTxtFirstName(){
        return firstName.getAttribute("Value");
    }
    public String getTxtLastName(){
        return lastName.getAttribute("Value");
    }
    public String getTxtPostalCode(){
        return postalCode.getAttribute("Value");
    }
    public String getTxtPaymentInfo(){
        return txtPaymentInfo.getText();
    }
    public String getTxtNameCard(){
        return txtNameCard.getText();
    }
    public String getTxtShippingInfo(){
        return txtShippingInfo.getText();
    }
    public String getTxtNameShipping(){
        return txtNameShipping.getText();
    }
    public String getTxtPriceTotal(){
        return txtPriceTotal.getText();
    }
    public String getTxtTotalItem(){
        return txtTotalItem.getText();
    }
    public String getTxtThankForOrder(){
        return txtThankForOrder.getText();
    }
    public String getTxtCheckoutComplete(){
        return txtCheckoutComplete.getText();
    }
}
