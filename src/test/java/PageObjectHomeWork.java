import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.FormPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageObjectHomeWork extends TestBase {


    FormPage formPage = new FormPage();


    @Test
    void formTestRework() {

//С Заполнением всех полей
       formPage .openUrl()
                .setFirstName("Pavel")
                .setLastName("Yatmanov")
                .setEmail("yatmanov@qa_guru_39.com")
                .setGenterWrapper("Male")
                .setUserNumber("9999999999")
                .setCalendat()
                .setDateOfBirth("19", "January", "1992")
                .setSubjectSendKeys("a", "Arts")
                .setHobbies("Sports")
                .setPictureInput("qa_guru.jpg")
                .currentAddress("Аблукова 105")
                .scrollPage()
                .setState("Uttar Pradesh")
                .setCity("Merrut")
                .setSubmit()

                //Проверка
                .checkResult("Pavel", "Student name")
                .checkResult("yatmanov@qa_guru_39.com", "Email")
                .checkResult("Male", "Gender")
                .checkResult("9999999999", "Mobile")
                .checkResult("19 January,1992", "Date")
                .checkResult("Arts", "Subjects")
                .checkResult("Sports", "Hobbies")
                .checkResult("qa_guru.jpg", "Picture")
                .checkResult("Аблукова 105", "Address")
                .checkResult("Uttar Pradesh Merrut", "State and City");

    }

//Заполнены только обязательные поля
@Test
    void notAll (){
    formPage .openUrl()
            .setFirstName("Pavel")
            .setLastName("Yatmanov")
            .setEmail("yatmanov@qa_guru_39.com")
            .setGenterWrapper("Male")
            .setUserNumber("9999999999")
            .setHobbies("Sports")
            .scrollPage()
            .setSubmit()

            //Проверка
            .checkResult("Pavel", "Student name")
            .checkResult("yatmanov@qa_guru_39.com", "Email")
            .checkResult("Male", "Gender")
            .checkResult("9999999999", "Mobile");

}

//Негативный тест
@Test
    public void negativeTest(){
    formPage .openUrl()
            .setFirstName("Pavel")
            .setLastName("Yatmanov")
            .setEmail("yatmanov@qa_guru_39.com")
            .setGenterWrapper("Male")
            .setUserNumber("9999999999")
            .setCalendat()
            .setDateOfBirth("19", "January", "1992")
            .setSubjectSendKeys("a", "Arts")
            .setHobbies("Sports")
            .setPictureInput("qa_guru.jpg")
            .currentAddress("Аблукова 105")
            .scrollPage()
            .setState("Uttar Pradesh")
            .setCity("Merrut")
            .setSubmit()
            .setModul();


}


}
