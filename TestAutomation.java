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
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='E-mail - Sign in - Google Accounts']")));
        browser.findElement(By.xpath("//h3[text()='E-mail - Sign in - Google Accounts']")).click();
        WebElement username = browser.findElement(By.id("identifierId"));
        username.sendKeys("2017cs155@stu.ucsc.cmb.ac.lk");

        browser.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait = new WebDriverWait(browser, 10);
        
    }
}