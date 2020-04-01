package com.github.dmitryalexeevi4.cucumber.stepdefs.autoru;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.dmitryalexeevi4.pages.CommonData;
import com.github.dmitryalexeevi4.pages.autoru.MainPage;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import static com.github.dmitryalexeevi4.cucumber.stepdefs.CommonSteps.commonData;
import static com.github.dmitryalexeevi4.pages.CommonData.*;


public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Затем("закрываем модальное окно")
    public void closeModal() {
        SelenideElement modal = $(".Modal_visible .Modal__closer");
        if (modal.is(visible)) {
            modal.click();
        }
    }

    @Затем("запоминаем количество автомобилей марки {word}")
    public void saveAdvCount(String carMark) {
        commonData.saveData(KEY_CAR_COUNT_FROM_MAIN_PAGE, mainPage.getAdvCount(carMark));
    }

    @Затем("пользователь переходит на страницу с объявлениями по марке {word}")
    public void enterCarsPage(String carMark) {
        mainPage.clickAdvButton(carMark);
    }
}
