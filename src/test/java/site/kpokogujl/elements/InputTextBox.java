package site.kpokogujl.elements;

import com.codeborne.selenide.SelenideElement;

public class InputTextBox {
    private final String name;
    private final SelenideElement locator;

    public InputTextBox(String name, SelenideElement locator) {
        this.name = name;
        this.locator = locator;
    }

    public void setValue (String value){
        locator.setValue(value);
        System.out.println("Заполняю поле \"" + name + "\" значением \"" + value + "\"");
    }

}
