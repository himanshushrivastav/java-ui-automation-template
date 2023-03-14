package util.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By register = By.linkText("Register");
    By userName = By.cssSelector("input[name='username']");
    By password = By.cssSelector("input[name='password']");
    By loginBtn = By.cssSelector("input[type='submit']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickRegisterLink(){

        this.driver.findElement(this.register).click();
    }
    public void fillUserName(String userName){

        this.driver.findElement(this.userName).sendKeys(userName);
    }
    public void fillPassword(String pswd){
        this.driver.findElement(this.password).sendKeys(pswd);
    }
    public void clickLogin(){
        this.driver.findElement(this.loginBtn).click();
    }
}
