package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjectsMethods.LoginPageAction;
import pageObjectsMethods.RegisterUserAction;
import util.WebDriverInitializer;

public class TestLogin {
    WebDriver driver;
    LoginPageAction lp;
    RegisterUserAction rua;

    @BeforeClass
    void setUp(){
        WebDriverInitializer wd = new WebDriverInitializer();
        driver = wd.createWebDriver("edge");
        lp = new LoginPageAction(driver);
        rua = new RegisterUserAction(driver);
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @Test
    void loginTest(){
        lp.loginUser("testUserName2312", "Rest@1234");
        lp.clickLoginButton();
        driver.quit();
    }
}
