package com.github.dmitryalexeevi4.cucumber.stepdefs.bankspb;

import com.github.dmitryalexeevi4.pages.bankspb.MainPage;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Condition.*;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Тогда("появлется блок приветствия")
    public void userGreetingCheck() {
        mainPage.getUserGreeting().shouldBe(visible);
    }

    @Дано("пользователь входит на страницу {string}")
    public void enterSection(String sectionName) {
        mainPage.openNavBarSection(sectionName);
    }
}
