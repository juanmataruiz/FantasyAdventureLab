import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArsenalTest {

    private Arsenal arsenal;

    @Before
    public void before(){
         arsenal = new Arsenal();
     }

     @Test
    public void arsenalHasACollectionOfWeapons(){
        assertEquals(3, arsenal.getNumberOfWeapons());
     }
}
