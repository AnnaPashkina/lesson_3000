// Generated by Selenium IDE
import com.google.common.io.Closer;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class export {
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
    public void teseerrorlogoutuser() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1280, 626));
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"error\"]")).click();
        assertThat(driver.findElement(By.cssSelector("*[data-test=\"error\"]")).getText(), is("Epic sadface: Sorry, this user has been locked out."));
        driver.close();
    }

    @Test
    public void teseerrorlogoutuser2() {
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1280, 626));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.findElement(By.id("item_4_title_link")).findElement(By.className("inventory_item_name")).getText(), "Sauce Labs Backpack");
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
        driver.findElement(By.id("logout_sidebar_link")).click();


    }
}


