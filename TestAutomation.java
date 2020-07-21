import java.beans.Transient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestAutomation {

    @Test
    public void varifyEail(){
        System.setProperty("webdriver.gecko.driver", "F:\\Test Automation\\geckodriver.exe");
        WebDriver browser = new FirefoxDriver();
        browser.get("https://www.google.com");
        WebElement element = browser.findElement(By.name("q"));
        element.sendKeys("GMAIL");
        element.submit();
        WebDriverWait wait1 = new WebDriverWait(browser, 10);
        
    }
}