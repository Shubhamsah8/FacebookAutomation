package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount_xpath {

    public WebDriver driver;

    @Test
    public void createAccount() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("Shubham");
        driver.findElement(By.xpath("//input[contains(@name, 'lastname')]")).sendKeys("Shah");
        driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]")).sendKeys("8779817254");
        driver.findElement(By.xpath("//input[contains(@name, 'reg_passwd__')]")).sendKeys("Whysoserious123#");
        driver.findElement(By.xpath("//select[contains(@id, 'day')]")).sendKeys("4");
        driver.findElement(By.xpath("//select[contains(@id, 'month')]")).sendKeys("April");
        driver.findElement(By.xpath("//select[contains(@id, 'year')]")).sendKeys("2002");
        driver.findElement(By.xpath("//input[contains(@type, 'radio') and contains(@value, '2')]")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
    }
}