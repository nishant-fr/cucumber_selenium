package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    private WebDriver driver;
    private Boolean url = false;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean VerifyUrl(){

        if(driver.getCurrentUrl().contains("auth"))
            return url=true;
        return false;
    }

    @FindBy(how = How.ID, using = "username")
    private WebElement loginEmail;

    public void enterName(String name) {
        loginEmail.clear();
        loginEmail.sendKeys(name);
    }

    @FindBy(how = How.ID, using = "password")
    private WebElement loginPassword;
    public void enterPassword(String pasword){
        loginPassword.clear();
        loginPassword.sendKeys(pasword);
    }
    @FindBy(how = How.ID, using = "kc-login")
    private WebElement loginButton;
    public void clickLoginButton(){
        loginButton.click();
    }
    public boolean verifyLoginButtonIsVisible(){
        return loginButton.isDisplayed();
    }

}
