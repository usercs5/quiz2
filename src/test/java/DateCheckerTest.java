import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DateCheckerTest {

    @Test
    void januaryHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(
                checker.has31Days(Month.JANUARY),
                "January should have 31 days"
        );
    }

    @Test
    void aprilDoesNotHave31Days() {
        DateChecker checker = new DateChecker();

        assertFalse(
                checker.has31Days(Month.APRIL),
                "April should not have 31 days"
        );
    }
}
