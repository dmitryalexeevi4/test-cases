package com.github.dmitryalexeevi4.cucumber.stepdefs.autoru;

import com.github.dmitryalexeevi4.pages.autoru.CarPage;
import io.cucumber.java.ru.*;
import org.testng.Assert;

import static com.github.dmitryalexeevi4.cucumber.stepdefs.CommonSteps.commonData;
import static com.github.dmitryalexeevi4.pages.CommonData.*;


public class CarPageSteps {
    CarPage carPage = new CarPage();
    int advCountFromMainPage = commonData.getData(KEY_CAR_COUNT_FROM_MAIN_PAGE);

    @И("сверяем текущее количество машин с количеством машин на главной страницы")
    public void countCheck() {
        int currentAdvCount = carPage.getAdvCount();
        Assert.assertEquals(currentAdvCount, advCountFromMainPage);
    }

    @Затем("сохраняем количество объявлений конкретной модели {word}")
    public void saveModelAdvCount(String model) {
        commonData.saveData(KEY_MODEL_COUNT_FROM_CAR_PAGE, carPage.getModelAdvCount(model));
    }

    @Затем("пользователь переходит на страницу с объявлениями по модели {word}")
    public void enterCarModelPage(String model) {
        carPage.clickModelAdvButton(model);
    }
}
