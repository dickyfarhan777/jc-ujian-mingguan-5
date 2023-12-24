package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static ExtentTest extentTest;
    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //1
    @Given("Admin enter url web saucedemo")
    public void admin_enter_url_web_saucedemo(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Admin enter url web saucedemo");
    }
    @When("Admin enter username")
    public void admin_enter_username(){
        loginPage.setUsername("standard_user");
        extentTest.log(LogStatus.PASS,"Admin enter username");
    }
    @And("Admin enter password")
    public void admin_enter_password(){
        loginPage.setPassword("secret_sauce");
        extentTest.log(LogStatus.PASS,"Admin enter password");
    }
    @And("Admin click login button")
    public void admin_click_login_button(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Admin click login button");
    }
    @And("Admin click login button wrong username")
    public void admin_click_login_button_wrong_username(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Admin click login button");
    }
    @Then("Admin login succesful redirect page dashboard")
    public void admin_login_succesful_redirect_page_dashboard(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Products");
        extentTest.log(LogStatus.PASS,"Admin login succesful redirect page dashboard");
    }
    //2
    @Given("Admin enter url web saucedemo or admin logout")
    public void admin_enter_url_web_saucedemo_or_admin_logout(){
        loginPage.setClickBurgerMenu();
        loginPage.setClickMenuLogout();
        Assert.assertTrue(loginPage.getTxtLoginPage().contains("Swag Labs"));
        extentTest.log(LogStatus.PASS,"Admin enter url web saucedemo or admin logout");
    }

    @Then("Admin login can not login redirect page dashboard")
    public void admin_login_can_not_login_redirect_page_dashboard(){
        Assert.assertTrue(loginPage.getTxtLoginPage().contains("Swag Labs"));
        extentTest.log(LogStatus.PASS,"Admin login can not login redirect page dashboard");
    }
    //3
    @When("Admin enter wrong username")
    public void admin_enter_wrong_username(){
        loginPage.setUsername("standard_userrr");
        extentTest.log(LogStatus.PASS,"Admin enter wrong username");
    }

}
