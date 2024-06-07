package com.bigshop.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(id = "navbar")
    private WebElement logo;

    @FindBy(xpath = "//*[@id='__next']/div[1]/section/div[2]/div/div/div/div/form/div[1]/input")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id='__next']/div[1]/section/div[2]/div/div/div/div/form/div[2]/div/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='__next']/div[1]/section/div[2]/div/div/div/div/form/div[4]/button")
    private WebElement loginButton;

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

