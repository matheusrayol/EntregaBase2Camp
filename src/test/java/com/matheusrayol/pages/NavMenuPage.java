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
    By viewIssuesLink = By.cssSelector("a[href='/view_all_bug_page.php']");
    By reportIssueLink = By.cssSelector("a[href='/bug_report_page.php']");

    // Mapping - Project Selection
    By projectSelectionComboBox = By.cssSelector("td[class='login-info-right'] select");


    // Actions
    public void clicarNoLinkViewIssues() {
        click(viewIssuesLink);
    }

    public void clicarNoLinkReportIssue() {
        click(reportIssueLink);
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
