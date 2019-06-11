package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class FirstTests {

    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id ="pass")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement buttonLogIn;


    @Test
    public void firstExampleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ametidji\\repos\\exampleone1.1\\src\\resources\\chromedriver.exe");

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Start-maximized");

        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("http://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("contact@adress.com");
        driver.findElement(By.id("pass")).sendKeys("fravega");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
