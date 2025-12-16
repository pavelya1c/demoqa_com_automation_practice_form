import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class practice_form_rework {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
        Configuration.headless = true;
    }


    @Test
    void formTestRework() {


        open("/automation-practice-form");


        $("#firstName").setValue("Pavel");
        $("#lastName").setValue("Yatmanov");
        $("#userEmail").setValue("yatmanov@qa_guru_39.com");


        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9999999999");


        $(".react-datepicker__input-container").click();

        $(".react-datepicker__month-select").$(byText("January")).click();
        $(".react-datepicker__year-select").$(byText("1992")).click();
        $(".react-datepicker__month").$(byText("19")).click();


        $(".subjects-auto-complete__input").click();
        $("[aria-autocomplete=list]").sendKeys("a");
        $(byText("Arts")).click();


        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("qa_guru.jpg");
        $("#currentAddress").setValue("Аблукова 105");

        $("#submit").scrollTo();

        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Merrut")).click();

        $("#submit").click();


        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        $(".table-dark").shouldHave(text("yatmanov@qa_guru_39.com"));
        $(".table-dark").shouldHave(text("Male"));
        $(".table-dark").shouldHave(text("9999999999"));
        $(".table-dark").shouldHave(text("19 January,1992"));
        $(".table-dark").shouldHave(text("Arts"));
        $(".table-dark").shouldHave(text("Sports"));
        $(".table-dark").shouldHave(text("Аблукова 105"));
        $(".table-dark").shouldHave(text("Uttar Pradesh Merrut"));





    }





}
