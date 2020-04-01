package com.github.dmitryalexeevi4.pages.bankspb;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement usernameField = $(By.name("username"));
    private SelenideElement passwordField = $(By.name("password"));
    private SelenideElement otpCodeField = $(By.name("otpCode"));
    private SelenideElement authForm = $(By.xpath("//form[@action = '/auth/otp']"));

    public SelenideElement getAuthForm() {
        return authForm;
    }

    public LoginPage fieldsInsert(String username, String password) {
        usernameField.clear();
        usernameField.setValue(username);
        passwordField.clear();
        passwordField.setValue(password);
        return this;
    }

    public LoginPage codeInsert(String code) {
        otpCodeField.clear();
        otpCodeField.setValue(code);
        return this;
    }

    public LoginPage buttonClick(String buttonName) {
        $(By.xpath("//button[.='" + buttonName + "']")).click();
        return this;
    }
}