package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {
        /* Classname */

        WebElement computerTab = driver.findElement(By.xpath("//a[text()='Computers']"));
        computerTab.click();
        WebElement computerText = driver.findElement(By.xpath("//a[text()='Computers']"));
        String actualComputerText = computerText.getText();
        String expectedMessage = "Computers";
        Assert.assertEquals("verifying Computer Text", expectedMessage, actualComputerText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


    /*userShouldNavigateToComputerPageSuccessfully

     * click on the ‘Computers’ Tab
     * Verify the text ‘Computers’*/


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.get("https://demo.nopcommerce.com/");
        WebElement computersTab = driver.findElement(By.linkText("Computers"));
        computersTab.click();
        WebElement computersText = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualText = computersText.getText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }

    /*userShouldNavigateToElectronicsPageSuccessfully

     * click on the ‘Electronics’ Tab
     * Verify the text ‘Electronics’*/

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();
        WebElement electronicsText = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualText = electronicsText.getText();
        String expectedText = "Electronics";
        Assert.assertEquals(actualText, expectedText);
    }


    /*userShouldNavigateToApparelPageSuccessfully

     * click on the ‘Apparel’ Tab
     * Verify the text ‘Apparel’
     */
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();
        WebElement apparelText = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualText = apparelText.getText();
        String expectedText = "Apparel";
        Assert.assertEquals(actualText, expectedText);
    }

    /*userShouldNavigateToDigitalDownloadsPageSuccessfully
     * click on the ‘Digital downloads’ Tab
     * Verify the text ‘Digital downloads’*/
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.get("https://demo.nopcommerce.com/");
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTab.click();
        WebElement digitalDownloadsText = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualText = digitalDownloadsText.getText();
        String expectedText = "Digital downloads";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    /* userShouldNavigateToBooksPageSuccessfully

     * click on the ‘Books’ Tab
     * Verify the text ‘Books’*/

    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.get("https://demo.nopcommerce.com/");
        WebElement booksTab = driver.findElement(By.linkText("Books"));
        booksTab.click();
        WebElement booksText = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualText = booksText.getText();
        String expectedText = "Books";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    /* userShouldNavigateToJewelryPageSuccessfully

     * click on the ‘Jewelry’ Tab
     * Verify the text ‘Jewelry’*/
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.get("https://demo.nopcommerce.com/");
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
        jewelryTab.click();
        WebElement jewelryText = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualText = jewelryText.getText();
        String expectedText = "Jewelry";
        Assert.assertEquals(actualText, expectedText);
    }

    /*userShouldNavigateToGiftCardsPageSuccessfully

     * click on the ‘Gift Cards’ Tab*/
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
         driver.get("https://demo.nopcommerce.com/");
        WebElement giftCardsTab = driver.findElement(By.linkText("Gift Cards"));
        giftCardsTab.click();
        WebElement giftCardsText = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualText = giftCardsText.getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals(actualText, expectedText);
    }
}