package com.matheusrayol.flows;

import com.matheusrayol.pages.LoginPage;

public class LoginFlow {

    LoginPage loginPage;

    public LoginFlow() {
        loginPage = new LoginPage();
    }

    public void doLogin(String username, String password) {
        loginPage.fillUsernameField(username);
        loginPage.fillPasswordField(password);
        loginPage.clickLoginButton();
    }
}
