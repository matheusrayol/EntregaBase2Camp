package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    // Mapping Login Page Elements for testing:
    // Locates the username field by its name
    By usernameField = By.name("username");
    // Locates the password field by its name
    By passwordField = By.name("password");
    // Locates the login button using its type
    By loginButton = By.xpath("//input[@type='submit'][@value='Login']");

    // Login Page Actions
    // Method to fill the username field
    public void fillUsernameField(String username) {
        sendKeys(usernameField, username);
    }

    // Method to fill the password field
    public void fillPasswordField(String password) {
        sendKeys(passwordField, password);
    }

    // Method to click the login button
    public void clickLoginButton() {
        click(loginButton);
    }
}
