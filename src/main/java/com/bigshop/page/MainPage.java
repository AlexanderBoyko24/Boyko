package com.bigshop.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(id = "navbar")
    private WebElement pageTitle;

    public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }

}
