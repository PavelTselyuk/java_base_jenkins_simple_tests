package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SkippedTests {

    @Test
    @Disabled
    void someTest() {
        assertTrue(false);
    }

    @Test
    @Disabled("Some reason")
    void someTest1() {
        assertTrue(false);
    }

    @Test
    @Disabled
    public void testingStepsTest() {
        step("Какой-то безумно гениальный и интуитивно понятный шаг", () -> {
        });
    }

}
