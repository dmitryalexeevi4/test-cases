package com.github.dmitryalexeevi4.cucumber.stepdefs.autoru;

import com.github.dmitryalexeevi4.pages.autoru.CarPage;
import io.cucumber.java.ru.*;
import org.testng.Assert;

import static com.github.dmitryalexeevi4.cucumber.stepdefs.CommonSteps.commonData;


public class CarPageSteps {
    CarPage carPage = new CarPage();
    int advCountFromMainPage = commonData.getData("advCountFromMainPage");

    @И("сверяем текущее количество машин с количеством машин на главной страницы")
    public void countCheck() {
        int currentAdvCount = carPage.getAdvCount();
        Assert.assertEquals(currentAdvCount, advCountFromMainPage);
    }

    @Затем("сохраняем количество объявлений конкретной модели {word}")
    public void saveModelAdvCount(String model) {
        commonData.saveData("modelAdvCountFromCarPage", carPage.getModelAdvCount(model));
    }

    @Затем("пользователь переходит на страницу с объявлениями по модели {word}")
    public void enterCarModelPage(String model) {
        carPage.clickModelAdvButton(model);
    }
}
