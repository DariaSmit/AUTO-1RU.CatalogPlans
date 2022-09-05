package cloud.autotests.config;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class PageObject {

    public PageObject openPage() {
        Selenide.open("https://catalog-plans.ru");
        return this;
    }
}
