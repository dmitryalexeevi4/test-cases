package com.github.dmitryalexeevi4.cucumber.stepdefs.bankspb;

import com.github.dmitryalexeevi4.pages.bankspb.*;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Condition.visible;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @И("заполняет поля логина и пароля")
    public void setFields() {
        loginPage.fieldsInsert("demo", "demo");
    }

    @Когда("нажимает кнопку {string}")
    public void buttonClick(String buttonName) {
        loginPage.buttonClick(buttonName);
    }

    @Тогда("появляется форма двухфакторной авторизации")
    public void formCheck() {
        loginPage.getAuthForm().shouldBe(visible);
    }

    @Затем("заполненяет поле для кода")
    public void setCode() {
        loginPage.codeInsert("0000");
    }
}