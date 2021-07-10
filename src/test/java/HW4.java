package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



        public class HW4 {

    @Test
    void shouldCheckCode()

    {
        //открываем страничку Selenide в Github
        open("https://github.com/selenide/selenide");

        //переходим в раздел Wiki проекта
        $(".octicon-book").click();

        //Проверяем наличие SoftAssertions в списке страниц Pages и сразу кликаем.

        //не работает :(
        //$$(".markdown-body li").get(5).shouldHave(text("Soft assertions")).click();

        // а так работает
        $$("a").findBy(text("Soft assertions")).click();

        //проверяем наличие заголовка к коду "Using JUnit5 extend test class:"
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));

        //проверяем наличие кода по присутствию "@Test"
        $$(".markdown-body .highlight").get(4).shouldHave(text("@Test"));


    }
}
