package com.matheusrayol.flows;

import com.matheusrayol.pages.LoginPage;

public class LoginFlows {
    // Objects
    LoginPage loginPage;

    // Constructor
    public LoginFlows() {
        loginPage = new LoginPage();
    }

    // Flows
    public void efetuarLogin(String usuario, String senha) {
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
    }
}
