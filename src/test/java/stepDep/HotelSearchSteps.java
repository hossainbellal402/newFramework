package stepDep;

import Base.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HotelSearchPage;

public class HotelSearchSteps extends Config {

    HotelSearchPage page=new HotelSearchPage(driver);

    @Given("User in expedia home page")
    public void userInExpediaHomePage() {

    }

    @When("Click cheap hotel")
    public void clickCheapHotel() {
   page.searchHotelLink();

    }

    @Then("User on expedia hotel page")
    public void userOnExpediaHotelPage() {

    }
}
