package site.kpokogujl.elements;

import com.codeborne.selenide.SelenideElement;

public class Button {
    private final String name;
    private final SelenideElement locator;

    public Button(String name, SelenideElement locator) {
        this.name = name;
        this.locator = locator;
    }

    public void click()
    {
        locator.click();
        System.out.println("Нажимаю кнопку \"" + name + "\"");
    }
}
