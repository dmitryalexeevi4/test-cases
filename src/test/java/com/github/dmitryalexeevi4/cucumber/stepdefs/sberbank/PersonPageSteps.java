package com.github.dmitryalexeevi4.cucumber.stepdefs.sberbank;

import com.github.dmitryalexeevi4.pages.sberbank.PersonPage;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class PersonPageSteps {
    PersonPage personPage = new PersonPage();

    @И("закрывает куки")
    public void closeCookie() {
        $("a.cookie-warning__close").waitUntil(visible, 20000).click();
    }

    @Затем("пользователь открывает страницу {string}")
    public void openPage(String pageName) {
        personPage.moveTo("Вклады").openSection("Вклады");
        $("title").waitUntil(attribute("text", "«Сбербанк» - " + pageName), 5000);
    }
}
