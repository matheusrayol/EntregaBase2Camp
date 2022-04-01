package com.matheusrayol.tests;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.bases.TestBase;
import com.matheusrayol.flows.LoginFlows;
import com.matheusrayol.pages.LoginPage;
import com.matheusrayol.pages.NavMenuPage;
import com.matheusrayol.pages.ViewIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class ViewIssuesTests extends TestBase {

    // Objects
    LoginPage loginPage;
    LoginFlows loginFlows;
    NavMenuPage navMenuPage;
    ViewIssuePage viewIssuePage;

    // Parameters
    String usuario = GlobalParameters.DEFAULT_USERNAME;
    String senha = GlobalParameters.DEFAULT_PASSWORD;

    // Tests
    @Test
    public void visualizarIssuesComPrioridadeAlta() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        navMenuPage = new NavMenuPage();
        viewIssuePage = new ViewIssuePage();

        // Parameters
        String assignedToComboBox = "[none]";
        String assignedToSelectedText = "none";
        String priorityComboBox = "high";

        // Actions
        loginFlows.efetuarLogin(usuario, senha);
        navMenuPage.clicarNoLinkViewIssues();
        viewIssuePage.clicarLinkAssignedTo();
        viewIssuePage.selecionarAssignedToComboBox(assignedToComboBox);
        viewIssuePage.clicarLinkPriority();
        viewIssuePage.selecionarPriorityComboBox(priorityComboBox);
        viewIssuePage.clicarBotaoApply();

        // Assertions
        Assert.assertEquals(viewIssuePage.obterTextoAssignedTo(), assignedToSelectedText);
        Assert.assertEquals(viewIssuePage.obterTextoPriority(), priorityComboBox);

    }
}
