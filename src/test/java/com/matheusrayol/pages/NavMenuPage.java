package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import com.matheusrayol.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NavMenuPage extends PageBase {

    // Mapping - Menu
    // Optei por mapear os elementos pelo cssSelector, tendo em vista que o Mantis é um sistema multilinguagem e caso
    // o usuário altere o idioma, os elementos não ficariam corretamente mapeados com o mapeamento por name.
    By myviewLink = By.cssSelector("a[href='/my_view_page.php']");
    By viewIssuesLink = By.cssSelector("a[href='/view_all_bug_page.php']");
    By reportIssueLink = By.cssSelector("a[href='/bug_report_page.php']");
    By changelogLink = By.cssSelector("a[href='/changelog_page.php']");
    By roadmapLink = By.cssSelector("a[href='/roadmap_page.php']");
    By summaryLink = By.cssSelector("a[href='/summary_page.php']");
    By manageLink = By.cssSelector("a[href='/manage_overview_page.php']");
    By myAccountLink = By.cssSelector("a[href='/account_page.php']");
    By logoutLink = By.cssSelector("a[href='/logout_page.php']");

    // Mapping - Project Selection
    By projectSelectionComboBox = By.cssSelector("td[class='login-info-right'] select");


    // Actions
    public void clicarNoLinkMyViews() {
        click(myviewLink);
    }

    public void clicarNoLinkViewIssues() {
        click(viewIssuesLink);
    }

    public void clicarNoLinkReportIssue() {
        click(reportIssueLink);
    }

    public void clicarNoLinkChangelog() {
        click(changelogLink);
    }

    public void clicarNoLinkRoadmap() {
        click(roadmapLink);
    }

    public void clicarNoLinkSummary() {
        click(summaryLink);
    }

    public void clicarNoLinkManage() {
        click(manageLink);
    }

    public void clicarNoLinkMyAccount() {
        click(myAccountLink);
    }

    public void clicarNoLinkLogout() {
        click(logoutLink);
    }

    public void selecionarProjeto(String projectName) {
        comboBoxSelectByVisibleText(projectSelectionComboBox, projectName);
    }

    public Object obterProjetoSelecionadoNoComboBox() {
        WebElement comboBox = DriverUtils.INSTANCE.findElement(projectSelectionComboBox);
        Select comboBoxSelect = new Select(comboBox);
        return comboBoxSelect.getFirstSelectedOption().getText();
    }
}
