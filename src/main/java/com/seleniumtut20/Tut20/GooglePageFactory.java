package com.seleniumtut20.Tut20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by yaredtseghu on 23/01/2016.
 */
public class GooglePageFactory {

    WebDriver webdriver;

    @FindBy( name = "q")
    public WebElement searchBox;

    @FindBy( className = "lsb")
    public WebElement searchButton;

    public GooglePageFactory(WebDriver driver){
        this.webdriver = driver;
        PageFactory.initElements(webdriver, this );
    }

    public void enterSearchTerm(String strSearchTerm) {
        searchBox.clear();
        searchBox.sendKeys(strSearchTerm);
    }

    public void pressSerachButton() {
        searchButton.click();
    }

    public void performFullSearch(String searchTerm){
        this.enterSearchTerm(searchTerm);
        this.pressSerachButton();
    }
}
