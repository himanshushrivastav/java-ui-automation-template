package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverInitializer {
    WebDriver driver;

    public WebDriver createWebDriver(String type){
        switch (type.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();

            case "edge":
                WebDriverManager.edgedriver().setup();
                this.driver = new EdgeDriver();

            default:
                System.out.println("No browser is selected");
        }
        return driver;
    }
}
