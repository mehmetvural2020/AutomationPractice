package pages;
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import tests.TestBase;
import utils.Driver;

public class BasePage extends TestBase {
    @FindBy(id="header_logo")
    public WebElement logo;

    public void BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    // First we need to test the logo with id
    @Test
    public void testLogo(){
        logo.isDisplayed();
    }
}
