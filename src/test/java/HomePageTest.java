import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
    String driverPath="/home/andibalaj/Downloads/geckodriver-v0.29.1-linux64/geckodriver";
    String baseUrl="http://localhost:4200/users";
    public WebDriver driver;
    private HomePage homePage;
    @BeforeTest
    public void initialSetUp(){
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl); /*homePage.getBaseUrl()*/
        homePage=new HomePage(driver);
    }
    @Test(priority = 1) /*6*/
    public void verifyAddUserButton(){
        driver.get(baseUrl);
        homePage.getAddUserButton().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@formcontrolname,'username')]")).isDisplayed());
    }
    @Test(priority = 2) /*7*/
    public void verifyDeleteUserButton(){
        driver.get(baseUrl);
        homePage.getDeleteFirstUser().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'Yes')]")).isDisplayed());
    }
    @Test(priority = 3) /*8*/
    public void verifyEditFirstUserButton(){
        driver.get(baseUrl);
        homePage.getEditFirstUser().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@formcontrolname,'username')]")).isDisplayed());
    }
    @Test(priority = 4) /*9*/
    public void backButton(){
        driver.get(baseUrl);
        homePage.getBackButton().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='btn btn-outline-primary'][contains(.,'Login')]")).isDisplayed());
    }
    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
