// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class homework {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    String url = "https://www.saucedemo.com/";


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();

    }

    @After
    public void tearDown() {
        driver.quit();
    }



        @Test
    public void teseerroruser3() {
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1280, 626));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("arto");
        driver.findElement(By.id("last-name")).sendKeys("tyu");
        driver.findElement(By.id("postal-code")).sendKeys("125");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        assertEquals(driver.findElement(By.id("checkout_complete_container")).findElement(By.className("complete-header")).getText(), "THANK YOU FOR YOUR ORDER");
        assertEquals(driver.findElement(By.id("checkout_complete_container")).findElement(By.className("complete-text")).getText(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
            driver.findElement(By.id("react-burger-menu-btn")).click();
            WebDriverWait myWait = new WebDriverWait(driver,40);
            WebElement ele=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
            ele.click();



    }
}


