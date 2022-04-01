package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import org.openqa.selenium.By;

public class ViewIssuePage extends PageBase {

    // Mapping
    By assignedToLink = By.id("handler_id_filter");
    By assignedToComboBox = By.name("handler_id[]");
    By assignedToSelected = By.id("handler_id_filter_target");
    By priorityLink = By.id("show_priority_filter");
    By priorityComboBox = By.name("show_priority[]");
    By prioritySelected = By.id("show_priority_filter_target");
    By applyButton = By.name("filter");

    // Actions
    public void clicarLinkAssignedTo(){
        click(assignedToLink);
    }

    public void selecionarAssignedToComboBox(String assignedTo){
        comboBoxSelectByVisibleText(assignedToComboBox, assignedTo);
    }

    public void clicarLinkPriority(){
        click(priorityLink);
    }

    public void selecionarPriorityComboBox(String priority){
        comboBoxSelectByVisibleText(priorityComboBox, priority);
    }

    public void clicarBotaoApply(){
        click(applyButton);
    }

    public String obterTextoAssignedTo(){
        return getText(assignedToSelected);
    }

    public String obterTextoPriority(){
        return getText(prioritySelected);
    }
}
