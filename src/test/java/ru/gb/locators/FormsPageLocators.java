package ru.gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormsPageLocators {

    public By switchButton() {
        return MobileBy.xpath("//android.widget.Switch[@content-desc=\"switch\"]");
    }
    public By switchOffText() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc=\"switch-text\"]");
    }
}