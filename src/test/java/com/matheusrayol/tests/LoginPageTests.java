package com.matheusrayol.tests;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.bases.TestBase;
import com.matheusrayol.pages.LoginPage;
import com.matheusrayol.utils.DriverUtils;
import org.junit.Assert;
import org.junit.Test;

public class LoginPageTests extends TestBase {
    LoginPage loginPage;

    // Tests
    @Test
    public void loginWithValidCredentials() {
        try {
            loginPage = new LoginPage();

            // Parameters
            String username = GlobalParameters.DEFAULT_USERNAME;
            String password = GlobalParameters.DEFAULT_PASSWORD;
            String url = GlobalParameters.DEFAULT_URL + "my_view_page.php";

            // Test
            loginPage.fillUsernameField(username);
            loginPage.fillPasswordField(password);
            loginPage.clickLoginButton();

            // Verify if login succeeded
            Assert.assertEquals(DriverUtils.INSTANCE.getCurrentUrl(), url);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginPage = new LoginPage();

        // Parameters
        String username = GlobalParameters.DEFAULT_USERNAME;
        String password = "123mudar";
        String url = GlobalParameters.DEFAULT_URL + "login_page.php";

        // Test
        loginPage.fillUsernameField(username);
        loginPage.fillPasswordField(password);
        loginPage.clickLoginButton();

        // Verify if login failed
        Assert.assertTrue(DriverUtils.INSTANCE.getCurrentUrl().contains(url));
    }
}
