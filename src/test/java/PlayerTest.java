import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;


    @Before
    public void before(){
        player = new Player("Gimli", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", player.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, player.getHealthPoints());
    }
}
