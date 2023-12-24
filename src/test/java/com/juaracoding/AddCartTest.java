package com.juaracoding;

import com.juaracoding.pages.AddCartPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddCartTest {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static ExtentTest extentTest;
    private static AddCartPage addCartPage = new AddCartPage();

    public AddCartTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.navigate().refresh();
    }

    @Given("Admin login web saucedemo")
    public void admin_login_web_saucedemo() {
        loginPage.loginAdmin("standard_user", "secret_sauce");
        extentTest.log(LogStatus.PASS, "Admin login web saucedemo");

    }

    @When("Admin click add cart product 1")
    public void admin_click_add_cart_product_1() {
        addCartPage.clickProduct1();
        extentTest.log(LogStatus.PASS, "Admin click add cart product 1");


    }

    @Then("Admin click add cart product 2")
    public void admin_click_add_cart_product_2() {
        addCartPage.clickProduct2();
        extentTest.log(LogStatus.PASS, "Admin click add cart product 2");

    }

    //2
    @Given("Admin click cart button")
    public void admin_click_cart_button() {
        addCartPage.clickCart();
        Assert.assertTrue(addCartPage.getTxtMyCart().contains("Your Cart"));
        Assert.assertEquals(addCartPage.getTxtProduct2(),"Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(addCartPage.getTxtProduct1(),"Sauce Labs Fleece Jacket");
        extentTest.log(LogStatus.PASS, "Admin click cart button");
    }
    @When("Admin click checkout button")
    public void admin_click_checkout_button(){
        addCartPage.clickCheckOut();
        extentTest.log(LogStatus.PASS,"Admin click checkout button");

    }
    @And("Admin enter firstname and lastname and postalcode")
    public void admin_enter_firstname(){
        addCartPage.yourInformation("Dicky","frhnn","15521");
        Assert.assertEquals(addCartPage.getTxtYourInformation(),"Checkout: Your Information");
        Assert.assertEquals(addCartPage.getTxtFirstName(),"Dicky");
        Assert.assertEquals(addCartPage.getTxtLastName(),"frhnn");
        Assert.assertEquals(addCartPage.getTxtPostalCode(),"15521");
        extentTest.log(LogStatus.PASS,"Admin enter firstname and lastname and postalcode");

    }

    @And("Admin click continue button")
    public void admin_click_continue_button(){
        addCartPage.clickBtnContinue();
        extentTest.log(LogStatus.PASS,"Admin click continue button");
    }
    @And("Admin click finish button")
    public void admin_click_finish_button(){
        Assert.assertEquals(addCartPage.getTxtCheckoutOverview(),"Checkout: Overview");
        Assert.assertEquals(addCartPage.getTxtProduct2(),"Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(addCartPage.getTxtProduct1(),"Sauce Labs Fleece Jacket");
        Assert.assertEquals(addCartPage.getTxtPaymentInfo(),"Payment Information");
        Assert.assertEquals(addCartPage.getTxtNameCard(),"SauceCard #31337");
        Assert.assertEquals(addCartPage.getTxtShippingInfo(),"Shipping Information");
        Assert.assertEquals(addCartPage.getTxtNameShipping(),"Free Pony Express Delivery!");
        Assert.assertEquals(addCartPage.getTxtPriceTotal(),"Price Total");
        Assert.assertEquals(addCartPage.getTxtTotalItem(),"Item total: $65.98");
        addCartPage.clickBtnFinish();
        extentTest.log(LogStatus.PASS,"Admin click finish button");
    }
    @Then("User finish checkout product")
    public void user_finish_checkout_product(){
        Assert.assertTrue(addCartPage.getTxtCheckoutComplete().contains("Checkout: Complete!"));
        Assert.assertTrue(addCartPage.getTxtThankForOrder().contains("Thank you for your order!"));
        extentTest.log(LogStatus.PASS,"User finish checkout product");
    }
}
