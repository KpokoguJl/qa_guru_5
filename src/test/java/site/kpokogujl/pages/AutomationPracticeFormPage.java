package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import site.kpokogujl.elements.Button;
import site.kpokogujl.elements.GenderRadioButton;
import site.kpokogujl.elements.InputTextBox;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class AutomationPracticeFormPage {
    InputTextBox firstName = new InputTextBox("Имя", $("#firstName")),
        lastName = new InputTextBox("Фамилия", $("#lastName")),
        userEmail = new InputTextBox("имейл", $("#userEmail")),
        userNumber = new InputTextBox("номер телефона", $("#userNumber")),
        userAddress = new InputTextBox("адрес", $("#currentAddress"));
    Button submit = new Button("submit", $("#submit"));
    GenderRadioButton genderRadioButton = new GenderRadioButton("gender", $("#genterWrapper"));
    SelenideElement results = $(".table-responsive");


    public AutomationPracticeFormPage openPage(){
        open("https://demoqa.com/automation-practice-form");

        return this;
    }

    public AutomationPracticeFormPage typeFirstName(String value) {
        firstName.setValue(value);

        return this;
    }

    public AutomationPracticeFormPage typeLastName(String value) {
        lastName.setValue(value);

        return this;
    }

    public AutomationPracticeFormPage typeEmail(String value) {
        userEmail.setValue(value);

        return this;
    }

    public AutomationPracticeFormPage chooseGender(String gender){
        genderRadioButton.click(gender);

        return this;
    }

    public AutomationPracticeFormPage typeMobilePhone(String value) {
        userNumber.setValue(value);

        return this;
    }

    public AutomationPracticeFormPage setDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        String dayLocator = format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)", day);
        $(dayLocator).click();

        return this;
    }

    public AutomationPracticeFormPage setSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public AutomationPracticeFormPage chooseHobbies(String hobbie){
        $("#hobbiesWrapper").$(byText(hobbie)).click();

        return this;
    }

    public AutomationPracticeFormPage uploadFile (){
        $("#uploadPicture").uploadFromClasspath("file.txt");

        return this;
    }

    public AutomationPracticeFormPage typeAddress(String value) {
        userAddress.setValue(value);

        return this;
    }

    public AutomationPracticeFormPage selectState(String value) {
        $(byText("Select State")).click();
        $(byText(value)).scrollTo().click();

        return this;
    }

    public AutomationPracticeFormPage selectCity(String value) {
        $(byText("Select City")).click();
        $(byText(value)).scrollTo().click();

        return this;
    }

    public void submitForm (){
        submit.click();
    }

    public AutomationPracticeFormPage checkResults(String key, String value) {
        results.$(byText(key)).parent().shouldHave(text(value));

        return this;
    }

}
