package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    // Mapping
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.cssSelector("input[type='submit'][value='Login']");

    // Actions
    public void preencherUsuario(String username) {
        sendKeys(usernameField, username);
    }

    public void preencherSenha(String password) {
        sendKeys(passwordField, password);
    }

    public void clicarEmLogin() {
        click(loginButton);
    }
}
