package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.NAME, using = "email")
    WebElement email;

    @FindBy(how = How.NAME, using = "password")
    WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "my-login")
    WebElement submit;

    public void enterEmail() {
        email.sendKeys("bellal12@gmail.com");
    }

    public void enterPassword() {
        password.sendKeys("123456");
    }

    public void ClickLogin() {
        submit.click();
    }

}
