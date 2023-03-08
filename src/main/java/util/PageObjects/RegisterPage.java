package util.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    By firstname = By.cssSelector("input[id='customer.firstName']");
    By lastName = By.cssSelector("input[id='customer.lastName']");
    By addressLine = By.cssSelector("input[id='customer.address.street']");
    By city = By.cssSelector("input[id='customer.address.city']");
    By state = By.cssSelector("input[id='customer.address.state']");
    By zipCode = By.cssSelector("input[id='customer.address.zipCode']");
    By phoneNumber = By.cssSelector("input[id='customer.phoneNumber']");
    By ssn = By.cssSelector("input[id='customer.ssn']");
    By customerUserName = By.cssSelector("input[id='customer.username']");
    By customerPassword = By.cssSelector("input[id='customer.password']");
    By confirmPassword = By.cssSelector("input[id='repeatedPassword']");
    By register = By.cssSelector("input[value='Register']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillFirstName(String firstName){
        this.driver.findElement(this.firstname).sendKeys(firstName);
    }
    public void fillLastName(String LastName){
        this.driver.findElement(this.lastName).sendKeys(LastName);
    }
    public void addressLine(String addressLine){
        this.driver.findElement(this.addressLine).sendKeys(addressLine);
    }
    public void city(String city){
        this.driver.findElement(this.city).sendKeys(city);
    }
    public void state(String state){
        this.driver.findElement(this.state).sendKeys(state);
    }
    public void zipCode(String zipCode){
        this.driver.findElement(this.zipCode).sendKeys(zipCode);
    }
    public void phonessnNumber(String phoneNumber){
        this.driver.findElement(this.phoneNumber).sendKeys(phoneNumber);
    }
    public void ssn(String ssn){
        this.driver.findElement(this.ssn).sendKeys(ssn);
    }
    public void customerUserName(String customerUserName){
        this.driver.findElement(this.customerUserName).sendKeys(customerUserName);
    }
    public void customerPassword(String customerPassword){
        this.driver.findElement(this.customerPassword).sendKeys(customerPassword);
    }
    public void confirmPassword(String confirmPassword){
        this.driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
    }
    public void register(String register){
        this.driver.findElement(this.register).sendKeys(register);
    }
}
