import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CupTest {

    // 100 percentage done with all tests Getters and Setters

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void getPercentFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals(85.5, c.getPercentFull(), 0.001);
    }

//********* SETTERS

    @Test
    void setLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());
    }

    @Test
    void setPercentFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        c.setPercentFull(85.5);
        assertEquals(85.5, c.getPercentFull());
    }
}
