import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabyNameTest {
    @Test
    public void nameSetToCapital(){
        BabyName baby = new BabyName("lieke", Gender.F, 1);
        assertEquals("Lieke", baby.getName());
    }


}