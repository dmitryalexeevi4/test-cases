package com.github.dmitryalexeevi4.pages.bankspb;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OverviewPage extends Page {
    private SelenideElement financialFreedom = $("#header-container #can-spend");

    public SelenideElement getFinancialFreedom() {
        return financialFreedom;
    }

    public SelenideElement getMyAssets() {
        return financialFreedom.$(".my-assets");
    }
}