package stepDep;

import Base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.loginPage;

public class LoginSteps extends Config {

    loginPage login=new loginPage(driver);

    @Given("I am at talentTEK Home Page")
    public void iAmAtTalentTEKHomePage() {
        
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        login.enterEmail();
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        login.enterPassword();
        login.ClickLogin();
    }
}
