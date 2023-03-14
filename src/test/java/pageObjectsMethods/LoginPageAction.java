package pageObjectsMethods;

import org.openqa.selenium.WebDriver;
import util.PageObjects.LoginPage;

public class LoginPageAction {
    WebDriver driver;
    LoginPage lp;
    public LoginPageAction(WebDriver driver){
        this.driver = driver;
        lp = new LoginPage(driver);
    }
    public void loginUser(String userName, String pswd){
        this.lp.fillUserName(userName);
        this.lp.fillPassword(pswd);
    }
    public void clickLoginButton(){
        lp.clickLogin();
    }
    public void clickRegisterUserLink(){
        this.lp.clickRegisterLink();
    }
}
