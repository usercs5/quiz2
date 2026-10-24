import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class DateCheckerTest {

    @@ -24,4 +26,26 @@ void aprilDoesNotHave31Days() {
                "April should not have 31 days"
        );
    }

  @ParameterizedTest
    @EnumSource(
            value = Month.class,
            names = {
                    "JANUARY",
                    "MARCH",
                    "MAY",
                    "JULY",
                    "AUGUST",
                    "OCTOBER",
                    "DECEMBER"
            }
    )
    void monthsWith31DaysReturnTrue(Month month) {
        DateChecker checker = new DateChecker();

        assertTrue(
                checker.has31Days(month),
                month + " should have 31 days"
        );
    }
    
}
