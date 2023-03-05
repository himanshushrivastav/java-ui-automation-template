package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInitializer {
    WebDriver driver;

    public void createWebdriver(String type){
        switch (type.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();

            case "edge":
                WebDriverManager.edgedriver().setup();
//                this.driver = new Edgedriver();
        }
    }
}
