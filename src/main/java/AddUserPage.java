import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

@Getter
public class AddUserPage {
    private String baseUrl = "http://localhost:4200/users";
    private String driverPath = "/home/andibalaj/Downloads/geckodriver-v0.29.1-linux64/geckodriver";
    @FindBy(xpath = "(//span[contains(.,'Add user')])[2]")
    private WebElement addUser;
    @FindBy(xpath = "//input[contains(@formcontrolname,'username')]")
    private WebElement addUsername;
    @FindBy(xpath="//input[contains(@formcontrolname,'email')]")
    private static WebElement existingEmail;
    @FindBy(xpath = "//input[contains(@formcontrolname,'email')]")
    private WebElement addEmail;
    @FindBy(xpath = "//input[contains(@formcontrolname,'fullName')]")
    private WebElement addFullName;
    @FindBy(xpath = "//input[contains(@formcontrolname,'password')]")
    private WebElement addPassword;
    @FindBy(xpath = "(//span[contains(@class,'mat-checkbox-inner-container')])[1]")
    private WebElement addTrait1Field;
    @FindBy(xpath = "(//span[contains(@class,'mat-checkbox-inner-container')])[2]")
    private WebElement addTrait2Field;
    @FindBy(xpath = "(//span[contains(@class,'mat-checkbox-inner-container')])[3]")
    private WebElement addTrait3Field;
    @FindBy(xpath = "(//span[contains(@class,'mat-checkbox-inner-container')])[4]")
    private WebElement addTrait4Field;
    @FindBy(xpath = "(//span[contains(@class,'mat-radio-outer-circle')])[1]")
    private WebElement addMaleGenderButton;
    @FindBy(xpath = "(//span[contains(@class,'mat-radio-outer-circle')])[2]")
    private WebElement addFemaleGenderButton;
    @FindBy(xpath = "(//span[contains(@class,'mat-radio-outer-circle')])[3]")
    private WebElement addApacheHelicopterGenderButton;
    @FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Submit')]")
    private WebElement submitButton;
    @FindBy(xpath = "//i[contains(@class,'fas fa-times fa-3x')]")
    private WebElement cancelButton;
    private WebDriver driver;

    public AddUserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String generateRandomUsername() {
        Random r = new Random();
        int c = r.nextInt(9999);
        return "User" + c;
    }
    public String generateRandomEmail() {
        Random r = new Random();
        int c = r.nextInt(9999);
        return "email" + c+"@yahoo.com";
    }
    public String generateRandomFullName() {
        Random r = new Random();
        int c = r.nextInt(9999);
        return "Full name" + c;
    }
    public String generateRandomPassword() {
        Random r = new Random();
        int c = r.nextInt(9999);
        return "Password" + c;
    }
    public WebElement getAddUser(){
        return addUser;
    }

    public WebElement getAddUsername() {
        return addUsername;
    }

    public static WebElement getExistingEmail() {
        return existingEmail;
    }

    public WebElement getAddEmail() {
        return addEmail;
    }

    public WebElement getAddFullName() {
        return addFullName;
    }

    public WebElement getAddPassword() {
        return addPassword;
    }

    public WebElement getAddTrait1Field() {
        return addTrait1Field;
    }

    public WebElement getAddTrait2Field() {
        return addTrait2Field;
    }

    public WebElement getAddTrait3Field() {
        return addTrait3Field;
    }

    public WebElement getAddTrait4Field() {
        return addTrait4Field;
    }

    public WebElement getAddMaleGenderButton() {
        return addMaleGenderButton;
    }

    public WebElement getAddFemaleGenderButton() {
        return addFemaleGenderButton;
    }

    public WebElement getAddApacheHelicopterGenderButton() {
        return addApacheHelicopterGenderButton;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getCancelButton(){
        return cancelButton;
    }
}
