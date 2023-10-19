import util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPositiveTest {

    @org.junit.jupiter.api.Test
    void stringUtilsTest() {
        String[] numbers = {"0", "-1", "2", "3", "4"};
        assertTrue(StringUtils.isPositiveNumber(numbers[0]));
        assertFalse(StringUtils.isPositiveNumber(numbers[1]));
    }
}

