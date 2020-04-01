package com.github.dmitryalexeevi4.cucumber.stepdefs.autoru;

import com.github.dmitryalexeevi4.pages.autoru.CarModelPage;
import io.cucumber.java.ru.*;
import org.testng.Assert;

import static com.github.dmitryalexeevi4.cucumber.stepdefs.CommonSteps.commonData;

public class CarModelPageSteps {
    CarModelPage carModelPage = new CarModelPage();
    int modelAdvCountFromCarPage = commonData.getData("modelAdvCountFromCarPage");

    @И("сверяем текущее количество машин с количеством машин на странице марки")
    public void countCheck() {
        int currentAdvCount = carModelPage.getAdvCount();
        Assert.assertEquals(currentAdvCount, modelAdvCountFromCarPage);
    }
}
