package com.github.dmitryalexeevi4.cucumber.stepdefs.bankspb;

import com.codeborne.selenide.SelenideElement;
import com.github.dmitryalexeevi4.pages.bankspb.OverviewPage;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class OverviewPageSteps {
    OverviewPage overviewPage = new OverviewPage();

    SelenideElement financialFreedom = overviewPage.getFinancialFreedom();
    SelenideElement myAssets = overviewPage.getMyAssets();

    @Также("на странице должен отображаться блок Финансовая свобода")
    public void blockCheck() {
        financialFreedom.shouldBe(visible);
    }

    @Ктомуже("указанная сумма должна соответствовать формату")
    public void sumMatch() {
        financialFreedom.should(matchText("\\d{1,3}\\s\\d{3}\\s\\d{3}\\.\\d{2}\\s\\₽"));
    }

    @Допустим("пользователь наводит курсор на блок Финансовая свобода")
    public void moveTo() {
        actions().moveToElement(financialFreedom).perform();
    }

    @Затем("должна отобразиться строка Мои финансы")
    public void stringCheck() {
        myAssets.shouldBe(visible);
    }

    @А("указанная сумма должна соответсвовать формату")
    public void innerSumMatch() {
        myAssets.shouldHave(matchText("\\d{1,3}\\s\\d{3}\\s\\d{3}\\.\\d{2}\\s\\₽"));
    }
}
