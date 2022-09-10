package site.kpokogujl.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;

public class GenderRadioButton {
    private final String name;
    private final SelenideElement locator;

    public GenderRadioButton(String name, SelenideElement locator) {
        this.name = name;
        this.locator = locator;
    }

    public void click(String gender){
        locator.$(byText(gender)).click();
        System.out.println("Кликаю по гендеру " + "\"" + gender + "\"" + "в радиобаттоне \"" + name + "\"");
    }
}
