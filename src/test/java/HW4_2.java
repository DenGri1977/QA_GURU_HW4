import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class HW4_2 {
    @Test
    void dragAndDropExercize()
    {
        //открываем https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //претаскиваем элементы (не хочет!)
        //actions().clickAndHold($("#column-a")).release($("#column-b")).perform();

        //так работает
        $("#column-a").dragAndDropTo("#column-b");

        //проверяем положение элементов наличием хидера B в первой колонке
        $(".column").shouldHave(Condition.text("B"));



    }


}
