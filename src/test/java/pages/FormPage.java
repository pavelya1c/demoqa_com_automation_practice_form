package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPage {


    public SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            calendarOpen = $(".react-datepicker__input-container"),
            genterWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            calendatInput = $(".react-datepicker__input-container"),
            selectMonthInput = $(".react-datepicker__month-select"),
            selectYearInput = $(".react-datepicker__year-select"),
            selectDayInput = $(".react-datepicker__month"),
            subjectInput = $(".subjects-auto-complete__input"),
            subjectSendKeysInput = $("[aria-autocomplete=list]"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            submitInput = $("#submit"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            modalInput = $(".modal-dialog");


    CalendarComponent calendarComponent = new CalendarComponent();
    TableComponent tableComponent = new TableComponent();

    //Первоначальные методы
    public FormPage openUrl() {
        open("/automation-practice-form");

        return this;
    }

    public FormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public FormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public FormPage setCalendarOpen() {
        calendarOpen.click();

        return this;
    }

    public FormPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public FormPage setGenterWrapper(String value) {
        genterWrapper.$(byText(value)).click();

        return this;
    }

    public FormPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public FormPage setCalendat() {
        calendatInput.click();
        return this;
    }

    public FormPage setMouth(String value) {
        selectMonthInput.$(byText(value)).click();

        return this;
    }

    public FormPage setYear(String value) {
        selectYearInput.$(byText(value)).click();

        return this;
    }

    public FormPage setDay(String value) {
        selectDayInput.$(byText(value)).click();

        return this;

    }

    public FormPage setDateOfBirth(String day, String month, String year) {
        calendatInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }




    public FormPage setSubjectSendKeys(String latter, String word) {
        subjectInput.click();
        subjectSendKeysInput.sendKeys(latter);
        $(byText(word)).click();

        return this;
    }

    public FormPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();

        return this;
    }

    public FormPage setPictureInput(String value) {
        pictureInput.uploadFromClasspath(value);

        return this;
    }

    public FormPage currentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public FormPage scrollPage() {
        submitInput.scrollTo();

        return this;
    }

    public FormPage setState(String value) {
        stateInput.click();
        $(byText(value)).click();

        return this;
    }

    public FormPage setCity(String value) {
        cityInput.click();
        $(byText(value)).click();

        return this;
    }

    public FormPage setSubmit() {
        submitInput.click();

        return this;
    }

    public FormPage checkResult(String key, String value) {
        tableComponent.setTable(key, value);

        return this;
    }



    public FormPage setModul() {
        modalInput.shouldNotBe(visible);

        return this;
    }




}









