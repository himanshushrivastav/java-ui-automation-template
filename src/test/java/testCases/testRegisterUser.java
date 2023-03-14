package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjectsMethods.LoginPageAction;
import pageObjectsMethods.RegisterUserAction;
import util.WebDriverInitializer;

public class testRegisterUser {
    WebDriver driver;
    LoginPageAction lp;
    RegisterUserAction rua;

    @BeforeClass
    void setUp() {
        WebDriverInitializer wd = new WebDriverInitializer();
        driver = wd.createWebDriver("edge");
        LoginPageAction lp = new LoginPageAction(driver);
        this.lp = lp;
        rua = new RegisterUserAction(driver);
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }


    @Test
    void registerUser() {
        this.lp.clickRegisterUserLink();
        System.out.println("Clicked on Link");
    }

    @Test
    void fillDetails() {
        rua.fillRegisterUserForm("testFirstName", "testLastName",
                "testAddress", "testState", "testCity",
                "12345", "1234567890", "123",
                "testUserName2312", "Rest@1234");
        rua.clickRegister();
        driver.quit();
    }
//    now create Login action with these user is created
}
