package PageObjects;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {


    public AccountRegistrationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement textFirstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement textLastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement textEmail;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement textTelephone;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement textPassword;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement textConfirmPassword;

    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement radioBoxSubscribe;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement checkPolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement buttonContinue;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement messageConfirmation;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement ContinueAfterRegister;

    public void setFirstName(String firstName){
        textFirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        textLastName.sendKeys(lastName);
    }

    public void setEmail(String email){
        textEmail.sendKeys(email);
    }

    public void setTelephone(String telephone){
        textTelephone.sendKeys(telephone);
    }

    public void setPassword(String password){
        textPassword.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        textConfirmPassword.sendKeys(confirmPassword);
    }

    public void checkSubscribe(){
        radioBoxSubscribe.click();
    }

    public void checkPolicyCheckbox(){
        checkPolicy.click();
    }

    public void clickContinue(){
        buttonContinue.click();

//        buttonContinue.submit();

//        Actions act = new Actions(driver);
//        act.moveToElement(buttonContinue).click().perform();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",buttonContinue);

//        buttonContinue.sendKeys(Keys.RETURN);

//        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(11));
//        mywait.until(ExpectedConditions.elementToBeClickable(buttonContinue)).click();

    }

    public String getConfirmationMessage(){
        try{
            return (messageConfirmation.getText());
        } catch (Exception e){
            return (e.getMessage());
        }
    }






}
