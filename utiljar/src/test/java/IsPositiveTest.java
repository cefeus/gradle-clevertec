import org.junit.jupiter.api.Test;
import util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPositiveTest {

    @Test
    void stringUtilsTest_allPositiveNumbers_shouldBeTrue() {
        String[] numbers = {"0", "1", "2", "3", "4"};
        assertTrue(StringUtils.isPositiveNumber(numbers[0]));
    }

    @Test
    void stringUtilsTest_fewNegativeNumbers_shouldBeFalse() {
        String[] numbers = {"0", "-1", "2", "-3", "4"};
        assertFalse(StringUtils.isPositiveNumber(numbers[1]));
    }
}

