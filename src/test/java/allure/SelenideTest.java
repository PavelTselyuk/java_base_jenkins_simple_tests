package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
    public void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $(".HeaderSearch-module__searchSlot__oVOUS").click();
        $(".prc-components-Input-IwWrt").setValue("PavelTselyuk/java_base_jenkins_simple_tests").pressEnter();

        $(linkText("PavelTselyuk/java_base_jenkins_simple_tests")).click();
        $("#issues-tab").click();
        $(withText("Test")).should(Condition.exist);
    }

}
