package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {



    public HotelSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how=How.CSS,using = "//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[2]/td/div/h3/a")
    WebElement searchHotel;

    public void searchHotelLink(){
        searchHotel.click();
    }

}
