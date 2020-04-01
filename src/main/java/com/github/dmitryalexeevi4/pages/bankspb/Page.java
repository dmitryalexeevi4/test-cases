package com.github.dmitryalexeevi4.pages.bankspb;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;

public class Page {
    public SelenideElement getUserGreeting() {
        return $(By.id("user-greeting"));
    }

    public Page openNavBarSection(String sectionName) {
        $(By.xpath("//ul[@class = 'navigation-menu nav' ]/li/a[.='" + sectionName + "']")).click();
        return this;
    }
}
