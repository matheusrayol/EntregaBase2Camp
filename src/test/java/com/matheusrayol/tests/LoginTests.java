package com.matheusrayol.tests;

import org.junit.Assert;
import org.junit.Test;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.bases.TestBase;
import com.matheusrayol.flows.LoginFlows;
import com.matheusrayol.pages.LoginPage;
import com.matheusrayol.utils.DriverUtils;

public class LoginTests extends TestBase {

    // Objects
    LoginPage loginPage;
    LoginFlows loginFlows;

    // Tests
    @Test
    public void efetuarLoginCredenciaisInvalidas() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        // Parameters
        String usuario = GlobalParameters.DEFAULT_USERNAME;
        String senha = "123mudar";
        String url = GlobalParameters.DEFAULT_URL + "login_page.php";

        // Test
        loginFlows.efetuarLogin(usuario, senha);

        // Assertion
        Assert.assertTrue(DriverUtils.INSTANCE.getCurrentUrl().contains(url));
    }

    @Test
    public void efetuarLoginCredenciaisValidas() {

        // Objects instances
        loginPage  = new LoginPage();
        loginFlows = new LoginFlows();

        // Parameters
        String usuario = GlobalParameters.DEFAULT_USERNAME;
        String senha = GlobalParameters.DEFAULT_PASSWORD;
        String url = GlobalParameters.DEFAULT_URL + "my_view_page.php";

        // Test
        loginFlows.efetuarLogin(usuario, senha);

        // Assertion
        Assert.assertEquals(DriverUtils.INSTANCE.getCurrentUrl(), url);
    }

    @Test
    public void efetuarLoginSemSenha() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        // Parameters
        String usuario = GlobalParameters.DEFAULT_USERNAME;
        String senha = "";
        String url = GlobalParameters.DEFAULT_URL + "login_page.php";

        // Test
        loginFlows.efetuarLogin(usuario, senha);

        // Assertion
        Assert.assertTrue(DriverUtils.INSTANCE.getCurrentUrl().contains(url));
    }

    @Test
    public void efetuarLoginSemUsuario() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        // Parameters
        String usuario = "";
        String senha = GlobalParameters.DEFAULT_PASSWORD;
        String url = GlobalParameters.DEFAULT_URL + "login_page.php";

        // Test
        loginFlows.efetuarLogin(usuario, senha);

        // Assertion
        Assert.assertTrue(DriverUtils.INSTANCE.getCurrentUrl().contains(url));
    }
}