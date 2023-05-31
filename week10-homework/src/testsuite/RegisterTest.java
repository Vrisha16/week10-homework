package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.className;


public class RegisterTest  extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {
        //Classname
        WebElement registerLink = driver.findElement(className("ico-register"));
        registerLink.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));

        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Register";
        Assert.assertEquals("Register", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();

    }


    /*5. Write down the following test into ‘RegisterTest’ class
    1. userShouldNavigateToRegisterPageSuccessfully

            * click on the ‘Register’ link
            * Verify the text ‘Register’*/
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.get("https://demo.nopcommerce.com/");
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement registerText = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualText = registerText.getText();
        String expectedText = "Register";
        Assert.assertEquals(actualText, expectedText);
    }
    /* 2. userSholdRegisterAccountSuccessfully

        * click on the ‘Register’ link
        * Select gender radio button
        * Enter First name
        * Enter Last name
        * Select Day Month and Year
        * Enter Email address
        * Enter Password
        * Enter Confirm password
        * Click on REGISTER button

        * Verify the text 'Your registration completed’*/
@Test
public void userShouldRegisterAccountSuccessfully() {
    //click on the ‘Register’ link
    driver.get("https://demo.nopcommerce.com/");
    WebElement registerLink = driver.findElement(By.linkText("Register"));
    registerLink.click();
    //Select gender radio button
    WebElement genderRadioButton = driver.findElement(By.id("gender-male"));
    genderRadioButton.click();
    //* Enter First name
    WebElement firstNameField = driver.findElement(By.id("FirstName"));
    firstNameField.sendKeys("Jai");
    //* Enter Last name
    WebElement lastNameField = driver.findElement(By.id("LastName"));
    lastNameField.sendKeys("Patel");
    // Select Day Month and Year
    WebElement dayDropdown = driver.findElement(By.name("DateOfBirthDay"));
   Select daySelect = new Select(dayDropdown);
    daySelect.selectByValue("1");
    WebElement monthDropdown = driver.findElement(By.name("DateOfBirthMonth"));
    Select monthSelect = new Select(monthDropdown);
    monthSelect.selectByValue("12");

    WebElement yearDropdown = driver.findElement(By.name("DateOfBirthYear"));
    Select yearSelect = new Select(yearDropdown);
    yearSelect.selectByValue("2003");
    // Enter Email address
    WebElement emailField = driver.findElement(By.id("Email"));
    emailField.sendKeys("Jai.patel@gmail.com");

    // Enter Password
    WebElement passwordField = driver.findElement(By.id("Password"));
    passwordField.sendKeys("password123456");

    // Enter Confirm password
    WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
    confirmPasswordField.sendKeys("password123456");

    // Click on REGISTER button
    WebElement registerButton = driver.findElement(By.id("register-button"));
    registerButton.click();

    // Verify the text 'Your registration completed'
    WebElement successMessage = driver.findElement(By.xpath("//div[@class='result']"));
    String actualMessage = successMessage.getText();
    String expectedMessage = "Your registration completed";
    Assert.assertEquals(actualMessage, expectedMessage);
}















}












