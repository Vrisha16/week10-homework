package testsuite;

/*Create the package ‘testsuite’ and create the following
        classes inside the ‘testsuite’ package.

        1. LoginTest
        2. TopMenuTest
        3. RegisterTest*/

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.id;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";
    public WebElement IdField;
    public WebElement passwordField;
    public WebElement loginButton;

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        //...
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();
        WebElement welcomeMessage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals("Verifying WelcomeMessage", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
       /* Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully

* click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign

        In!’*/
    @Test

    public void userShouldNavigateToLoginPageSuccessfully() {
        // Click on the 'Login' link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Verify the text 'Welcome, Please Sign In!' on the page
        WebElement welcomeText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String actualText = welcomeText.getText();
        String expectedText = "Welcome, Please Sign In!";
        if (actualText.equals(expectedText)) {
            System.out.println("Test Passed - User navigated to the login page successfully");
        } else {
            System.out.println("Test Failed - User failed to navigate to the login page");
        }
    }




    /* 2. userShouldLoginSuccessfullyWithValidCredentials

     * click on the ‘Login’ link
     * Enter valid username
     * Enter valid password
     * Click on ‘LOGIN’ button*/
    // Navigate to the login page


    // Click on the 'Login' link
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("Jai.patel@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("valid_password");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        String logoutText = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals(logoutText, "Log out");
    }



    @Test
    public void verifyTheErrorMessage() {
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(id("Email")).sendKeys("utisletap@gmail.com");
        driver.findElement(id("Password")).sendKeys("Msm_23");
        driver.findElement(By.xpath("input[value='Log in']")).click();
        String errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful.')]")).getText();
        Assert.assertEquals(errorMessage, "Login was unsuccessful. Please correct the errors and try again. No customer account found");
    }

    }

































