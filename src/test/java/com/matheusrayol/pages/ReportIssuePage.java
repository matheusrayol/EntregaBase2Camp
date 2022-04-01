package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import org.openqa.selenium.By;

public class ReportIssuePage extends PageBase {

    // Mapping
    By categoryDropdown = By.name("category_id");
    By reproducibilityDropdown = By.name("reproducibility");
    By severityDropdown = By.name("severity");
    By priorityDropdown = By.name("priority");
    By platformDropdown = By.name("platform");
    By profileDropdown = By.name("profile_id");
    By summaryField = By.name("summary");
    By descriptionField = By.name("description");
    By stepsToReproduceField = By.name("steps_to_reproduce");
    By additionalInfoField = By.name("additional_info");
    By uploadFileButton = By.name("ufile[]");
    By submitButton = By.xpath("//input[@tabindex='18']");
    By successMessage = By.cssSelector("body > div:nth-child(5)");

    // Actions

    public void selecionarCategoria(String categoria) {
        comboBoxSelectByVisibleText(categoryDropdown, categoria);
    }

    public void selecionarReprodutibilidade(String reproducibility) {
        comboBoxSelectByVisibleText(reproducibilityDropdown, reproducibility);
    }

    public void selecionarSeveridade(String severity) {
        comboBoxSelectByVisibleText(severityDropdown, severity);
    }

    public void selecionarPrioridade(String priority) {
        comboBoxSelectByVisibleText(priorityDropdown, priority);
    }

    public void selecionarPlatforma(String platform) {
        comboBoxSelectByVisibleText(platformDropdown, platform);
    }

    public void selecionarPerfil(String profile) {
        comboBoxSelectByVisibleText(profileDropdown, profile);
    }

    public void preencherResumo(String summary) {
        sendKeys(summaryField, summary);
    }

    public void preencherDescricao(String description) {
        sendKeys(descriptionField, description);
    }

    public void preencherPassosParaReproduzir(String stepsToReproduce) {
        sendKeys(stepsToReproduceField, stepsToReproduce);
    }

    public void preencherInformacoesAdicionais(String additionalInfo) {
        sendKeys(additionalInfoField, additionalInfo);
    }

    public void fazerUploadDeArquivo(String caminhoArquivo) {
        uploadFile(uploadFileButton, caminhoArquivo);
    }

    public void clicarNoBotaoReportIssue() {
        click(submitButton);
    }

    public String obterMensagemDeSucesso() {
        return getText(successMessage);
    }

}
