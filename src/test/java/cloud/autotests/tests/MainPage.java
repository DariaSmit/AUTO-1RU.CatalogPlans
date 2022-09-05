package cloud.autotests.tests;

import cloud.autotests.config.PageObject;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;


public class MainPage extends TestBase {
    PageObject PageObject = new PageObject();

    @Test
    @Description("Проверка сайта catalog-plans.ru)")
    @DisplayName("Проверка заголовков в шапке сайта")
    void TitleTest() {
        step("открыть https://catalog-plans.ru/", () -> {
            PageObject.openPage();
        });
        step("Проверить заголовки", () -> {
            $("#header1200").shouldHave(Condition.text("Каталог проектов▼"));
            $("#header1200").shouldHave(Condition.text("сравнить"));
            $("#header1200").shouldHave(Condition.text("Услуги▼"));
            $("#header1200").shouldHave(Condition.text("Статьи"));
        });
    }
        @Test
        @Description("Проверка сайта catalog-plans.ru)")
        @DisplayName("Проверка телеграм ссылки")
        void LinkTelegramTest() {
            step("открыть https://catalog-plans.ru/", () -> {
                PageObject.openPage();
            });
        step("нажать на кнопку Telegram", () -> {
            $(byLinkText("Telegram")).click();
        step("Проверить заголовок", ()-> {
                $(".tgme_page_title").shouldHave(Condition.text("Проекты Коттеджей"));
            });
        });
    }
    @Test
    @Description("Проверка сайта catalog-plans.ru)")
    @DisplayName("Проверка вконтакте ссылки")
    void LinkVkontakteTest() {
        step("открыть https://catalog-plans.ru/", () -> {
            PageObject.openPage();
        });
        step("нажать на кнопку Telegram", () -> {
            $(byLinkText("Vkontakte")).click();
            step("Проверить заголовок", ()-> {
                $(".PageCover__infoMain").shouldHave(Condition.text("Проекты домов и коттеджей"));
            });
        });
    }

    @Test
    @Description("Проверка сайта catalog-plans.ru)")
    @DisplayName("Проверка вконтакте ссылки")
    void LinkYandexTest() {
        step("открыть https://catalog-plans.ru/", () -> {
            PageObject.openPage();
        });
        step("нажать на кнопку Telegram", () -> {
            $(byLinkText("Яндекс Дзен")).click();
            step("Проверить заголовок", ()-> {
                $(".desktop-channel-layout__header").shouldHave(Condition.text("Проекты Коттеджей"));
            });
        });
    }
}