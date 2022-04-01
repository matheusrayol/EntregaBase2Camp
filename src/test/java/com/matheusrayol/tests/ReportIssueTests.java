package com.matheusrayol.tests;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.bases.TestBase;
import com.matheusrayol.flows.LoginFlows;
import com.matheusrayol.pages.LoginPage;
import com.matheusrayol.pages.NavMenuPage;
import com.matheusrayol.pages.ReportIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class ReportIssueTests extends TestBase {

    // Objects
    LoginPage loginPage;
    LoginFlows loginFlows;
    NavMenuPage navMenuPage;
    ReportIssuePage reportIssuePage;

    // Parameters
    String usuario = GlobalParameters.DEFAULT_USERNAME;
    String senha = GlobalParameters.DEFAULT_PASSWORD;

    // Tests
    @Test
    public void selecionarProjetoNoComboBox() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        navMenuPage = new NavMenuPage();
        reportIssuePage = new ReportIssuePage();

        // Test
        loginFlows.efetuarLogin(usuario, senha);
        navMenuPage.selecionarProjeto("Daniella Maleski's Project");

        // Assertion
        Assert.assertEquals("Daniella Maleski's Project", navMenuPage.obterProjetoSelecionadoNoComboBox());
    }

    @Test
    public void reportarIssueResumida() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        navMenuPage = new NavMenuPage();
        reportIssuePage = new ReportIssuePage();

        /* MASSA DE DADOS
         * Para a execução deste teste é necessário o preenchimento dos campos requeridos para a criação de um issue
         * no projeto Daniella Maleski's Project. Os dados necessários de cada campo estão listados como parâmetros
         * abaixo, de acordo com os campos mínimos exigidos para o cadastramento da issue no sistema. */

        // Parameters
        String categoria = "[All Projects] Apptest";
        String resumo = "Teste de Report Issue";
        String descricao = "Teste de Report Issue realizado através de suite de testes automatizados.";
        String mensagemSucessoEsperada = "Operation successful.";

        // Test
        loginFlows.efetuarLogin(usuario, senha);
        navMenuPage.selecionarProjeto("Daniella Maleski's Project");
        navMenuPage.clicarNoLinkReportIssue();
        reportIssuePage.selecionarCategoria(categoria);
        reportIssuePage.preencherResumo(resumo);
        reportIssuePage.preencherDescricao(descricao);
        reportIssuePage.clicarNoBotaoReportIssue();

        // Assertion
        Assert.assertTrue(reportIssuePage.obterMensagemDeSucesso().contains(mensagemSucessoEsperada));
    }

    @Test
    public void reportarIssueDetalhada() {

        // Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        navMenuPage = new NavMenuPage();
        reportIssuePage = new ReportIssuePage();

        /* MASSA DE DADOS
         * Para a execução deste teste é necessário o preenchimento dos campos para a criação de um issue no projeto
         * Daniella Maleski's Project. Os dados necessários de cada campo estão listados como parâmetros abaixo,
         * de acordo com os campos mínimos exigidos, bem como os campos adicionais presentes  para o cadastramento
         * detalhado de uma issue no sistema. */

        // Parameters
        String categoria = "[All Projects] Apptest";
        String reprodutibilidade = "always";
        String severidade = "minor";
        String prioridade = "normal";
        String perfil = "Desktop Windows 10";
        String resumo = "Teste de Report Issue Detalhado";
        String descricao = "Teste de Report Issue realizado através de suite de testes automatizados.";
        String passos = "1. Efetuar login no sistema;\n" +
                        "2. Clicar em Report Issue;\n" +
                        "3. Selecionar o Projeto;\n" +
                        "4. Selecionar a categoria Apptest;\n" +
                        "5. Selecionar reprodutibildiade;\n" +
                        "6. Selecionar severidade;\n" +
                        "7. Selecionar prioridade;\n" +
                        "8. Selecionar perfil;\n" +
                        "9. Preencher o resumo;\n" +
                        "10. Preencher a descrição;\n" +
                        "11. Preencher os passos para reproduzir o erro;\n" +
                        "12. Incluir informações adicionais;\n" +
                        "13. Clicar no botão Report Issue;\n";
        String informacaoAdicional = "Informação adicional";
        String mensagemSucessoEsperada = "Operation successful.";

        // Test
        loginFlows.efetuarLogin(usuario, senha);
        navMenuPage.selecionarProjeto("Daniella Maleski's Project");
        navMenuPage.clicarNoLinkReportIssue();
        reportIssuePage.selecionarCategoria(categoria);
        reportIssuePage.selecionarReprodutibilidade(reprodutibilidade);
        reportIssuePage.selecionarSeveridade(severidade);
        reportIssuePage.selecionarPrioridade(prioridade);
        reportIssuePage.selecionarPerfil(perfil);
        reportIssuePage.preencherResumo(resumo);
        reportIssuePage.preencherDescricao(descricao);
        reportIssuePage.preencherPassosParaReproduzir(passos);
        reportIssuePage.preencherInformacoesAdicionais(informacaoAdicional);
        reportIssuePage.clicarNoBotaoReportIssue();

        // Assertion
        Assert.assertTrue(reportIssuePage.obterMensagemDeSucesso().contains(mensagemSucessoEsperada));
    }
}
