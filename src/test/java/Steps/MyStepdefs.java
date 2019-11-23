package Steps;

import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class MyStepdefs {
    private WebDriver driver = null;

    @Given("The user login to the application")
    public void the_user_login_to_the_application() throws IOException {
        /*
        LoginPage loginObject = new LoginPage(driver);
        String userID = "";
        String userPassword = "";
        loginObject.enterName(userID);
        loginObject.enterPassword(userPassword);
        loginObject.clickLoginButton();*/


    }

    @When("the credentials are entered")
    public void the_credentials_are_entered() {
        /*String userID = "";
        String userPassword ="";
        LoginPage loginObject = new LoginPage(driver);
        loginObject.enterName(userID);
        loginObject.enterPassword(userPassword);
        loginObject.clickLoginButton();
        HomePage lHome = new HomePage(driver);
        lHome.verifyMenuIsDisplayed();
*/
    }

    @Then("the homepage is viewed")
    public void the_homepage_is_viewed() {

  /*      HomePage homeObject = new HomePage(driver);
        homeObject.verifyMenuIsDisplayed();*/
    }


}
