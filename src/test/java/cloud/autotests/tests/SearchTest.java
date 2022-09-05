package cloud.autotests.tests;

import cloud.autotests.config.PageObject;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static io.qameta.allure.Allure.step;

public class SearchTest extends TestBase {

    PageObject PageObject = new PageObject();

    @Test
    @Description("Проверка сайта catalog-plans.ru)")
    @DisplayName("Проверка поиска")
    void HouseTest() {
        step("открыть https://catalog-plans.ru/", () -> {
            PageObject.openPage();
        });
        step("Открыть ПРОЕКТЫ ОДНОЭТАЖНЫХ ДОМОВ'", () -> {
            $(".metro-container", 0).click();
        });
         step("Выбрать параметры поиска", ()-> {
             $(byName("areaOt")).click();
             $(byName("areaOt")).val("670");
             $(byName("gaboth")).click();
             executeJavaScript("window.scrollTo(0,133.3333282470703)");
             $(byName("gaboth")).val("010");

             $(byName("gabotw")).click();
             executeJavaScript("window.scrollTo(0,734.6666870117188)");
             $(byName("gabotw")).val("10");
             $("#collapse31 label:nth-child(2) > .checkmark").click();
             $("#collapse7 .col-xs-6:nth-child(2) > label:nth-child(1)").click();
             $("#collapse7 .col-xs-6:nth-child(3) > label:nth-child(2) > .checkmark").click();
         });
         step("проверить цену проекта по заданным поиском параметрам", ()-> {
             $(".cpcii-price").shouldHave(text("39000"));
         });

    }
}
