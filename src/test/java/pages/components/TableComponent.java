package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TableComponent {
    public void setTable(String key, String value){
        $(".table-dark").shouldHave(text(key)).parent().shouldHave(text(value));
    }
}
