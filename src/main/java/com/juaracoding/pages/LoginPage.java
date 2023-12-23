package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[contains(@class, 'login_logo')]")
    private WebElement txtLoginPage;
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement burgerMenu;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement clickMenuLogout;





    // GET TXT

    @FindBy(xpath = "//input[@pid='user-name']")
    private WebElement txtUsername;
    @FindBy(xpath = "//input[@pid='password']")
    private WebElement txtPassword;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement txtBtnLogin;
    @FindBy(xpath = "//span[contains(@class, 'title')]")
    private WebElement txtDashboard;
    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement txtErrorUsernameOrPassword;

    public void loginAdmin(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }


    public void setUsername(String username){
        this.username.sendKeys(username);
    }
    public void setPassword(String password){
        this.password.sendKeys(password);
    }
    public void setBtnLogin(){
        btnLogin.click();
    }
    public void setClickBurgerMenu(){
        burgerMenu.click();
    }
    public void setClickMenuLogout(){
        clickMenuLogout.click();
    }




    /// GetTXT
    public String getTxtLoginPage(){
        return txtLoginPage.getText();
    }
    public String getTxtUsername(){
    return txtUsername.getText();
    }
    public String getTxtPassword(){
    return txtPassword.getText();
    }
    public String getTxtLoginButton(){
        return txtBtnLogin.getText();
    }
    public String getTxtErrorUsernameOrPassword(){
        return txtErrorUsernameOrPassword.getText();
    }
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
}
