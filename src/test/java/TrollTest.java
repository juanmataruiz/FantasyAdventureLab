import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Arsenal arsenal;

    @Before
    public void before() {
        arsenal = new Arsenal();
        troll = new Troll("Glacinda", 100, arsenal);
    }

    @Test
    public void hasName() {
        assertEquals("Glacinda", troll.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, troll.getHealthPoints());
    }
}
