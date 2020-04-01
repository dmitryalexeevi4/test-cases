package com.github.dmitryalexeevi4.pages.bankspb;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OverviewPage extends Page {

    public SelenideElement getFinancialFreedom() {
        return $("#header-container #can-spend");
    }

    public SelenideElement getMyAssets() {
        return getFinancialFreedom().$(".my-assets");
    }
}