package com.bigshop.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class MainPage extends BasePage {

        //поменять xpath чтобы было понятно, что перешли на главную страницу
    @FindBy(id = "navbar")
    private WebElement pageTitle;

    @FindBy(className = "navbar-tool-icon-box")
    private WebElement menuButton;

    @FindBy(xpath= "//*[@id='navbar']/div[1]/div[1]/div/div[2]/div[1]/div/a[2]")
    private WebElement logoutButton;

        public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }

    public void logout() {
        menuButton.click();
        logoutButton.click();
    }

}