import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;





public class practice_form {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
        Configuration.headless = true;
    }


    @Test
    void lockedUserTest() {
        open("/automation-practice-form");


        $("[placeholder='First Name'].mr-sm-2#firstName").setValue("Pavel");
        System.out.println("Имя введено");
        $("[placeholder='Last Name'].mr-sm-2#lastName").setValue("Yatmanov");
        System.out.println("Фамилия введена");
        $("[placeholder='name@example.com'].mr-sm-2#userEmail").setValue("pavelya@qa_guru_39.com");
        System.out.println("Email введен");


        $(".custom-control.custom-radio.custom-control-inline").click();
        System.out.println("Выбран мужской пол");
        $("[placeholder='Mobile Number'].mr-sm-2#userNumber").setValue("9999999999");
        System.out.println("Мобильный номер введен");


        $("#dateOfBirthInput").click();
        System.out.println("Календарь открыт");
        $(".react-datepicker__month-select").$(byText("January")).click();
        $(".react-datepicker__year-select").$(byText("1992")).click();
        $(".react-datepicker__month").$(byText("19")).click();
        System.out.println("Дата в календаре выбрана");


        $(".subjects-auto-complete__input").click();
        $("[aria-autocomplete=list").sendKeys("a");
        $(byText("Arts")).click();
        System.out.println("Увлечение Искустро выбрано");


        $("#hobbiesWrapper").$(byText("Sports")).click();
        System.out.println("Чек бокс спорт выбран ");


        $("#uploadPicture").uploadFromClasspath("qa_guru.jpg");
        System.out.println("Картинка загружена");


        $("[placeholder='Current Address']").setValue("Аблукова 105");
        System.out.println("Адресс введен");


        $("#submit").scrollIntoView("{block: 'center'}");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        System.out.println("Штат/город выбраны");


        $(byText("Delhi")).click();
        $("#submit").click();
        System.out.println("Форма отправлена");


//Проверка
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).closest("tr").shouldHave(text("Pavel Yatmanov"));
        $(".table-responsive").$(byText("Student Email")).closest("tr").shouldHave(text("pavelya@qa_guru_39.com"));
        $(".table-responsive").$(byText("Gender")).closest("tr").shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).closest("tr").shouldHave(text("9999999999"));
        $(".table-responsive").$(byText("Date of Birth")).closest("tr").shouldHave(text("19 January,1992"));
        $(".table-responsive").$(byText("Subjects")).closest("tr").shouldHave(text("Arts"));
        $(".table-responsive").$(byText("Hobbies")).closest("tr").shouldHave(text("Sports"));
        $(".table-responsive").$(byText("Picture")).closest("tr").shouldHave(text("qa_guru.jpg"));
        $(".table-responsive").$(byText("Address")).closest("tr").shouldHave(text("Аблукова 105"));
        $(".table-responsive").$(byText("State and City")).closest("tr").shouldHave(text("NCR Delhi"));
System.out.println("Проверка формы выполнена");



        $("#closeLargeModal").scrollIntoView("{block: 'center'}");
        $("#closeLargeModal").click();



    }
}

