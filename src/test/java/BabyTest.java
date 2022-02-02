import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BabyTest {

    @Test
    void setExpected() {
        Baby baby = new Baby("Lieke", Gender.X, LocalDate.of(2022, 02, 22), true);
        assertTrue(baby.getExpected());
    }
    @Test
    void expectedUpdated() {
        Baby baby = new Baby("Lieke", Gender.X, LocalDate.of(2022, 02, 22), true);
        baby.setExpected(false, LocalDate.of(2022,01,01));
        assertFalse(baby.getExpected());
        assertEquals(0, baby.getWeeksLeft());
    }
}