package pageObjectsMethods;

import org.openqa.selenium.WebDriver;
import util.PageObjects.RegisterPage;

public class RegisterUserAction {
    WebDriver driver;
    RegisterPage rp;

    public RegisterUserAction(WebDriver driver) {
        this.driver = driver;
        rp = new RegisterPage(this.driver);
    }

    public void fillRegisterUserForm(String firstName, String lastName, String address, String state, String city,
                                     String zip, String phoneNumber, String ssn, String userName, String password) {
        rp.fillFirstName(firstName);
        rp.fillLastName(lastName);
        rp.addressLine(address);
        rp.city(city);
        rp.state(state);
        rp.zipCode(zip);
        rp.phonessnNumber(phoneNumber);
        rp.ssn(ssn);
        rp.customerUserName(userName);
        rp.customerPassword(password);
        rp.confirmPassword(password);

    }
    public void clickRegister(){
        rp.register();
    }
}
