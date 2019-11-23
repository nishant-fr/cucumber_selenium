package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    WebDriver driver;
    Boolean url = false;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean VerifyUrl(){
        if(driver.getCurrentUrl().contains("auth"))
            return url=true;
        return false;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='aside']/div/div[1]/a/span")
    private WebElement leftMenuBar;


    public boolean verifyMenuIsDisplayed() {
        return leftMenuBar.isDisplayed();
    }

}
