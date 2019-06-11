package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static base.Settings.*;

public class FirstTests {

    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id ="pass")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement buttonLogIn;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",RESOURCES + CHROMEDRIVER);
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void  navigateToBaseUrl (){
        driver.navigate().to(BASE_URL);
    }

    @Test
    public void firstExampleTest() throws InterruptedException {

        driver.findElement(By.id("email")).sendKeys("contact@adress.com");
        driver.findElement(By.id("pass")).sendKeys("fravega");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);

    }
    @Test
    public void secondExampleTest() throws InterruptedException {

        driver.findElement(By.id("email")).sendKeys("contact@adress.com");
        driver.findElement(By.id("pass")).sendKeys("fravega");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);

    }

}
