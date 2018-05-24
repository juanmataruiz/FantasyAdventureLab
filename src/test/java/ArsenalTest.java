import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

//     @Test
//    public void canGetWeapon() {
//        Weapon weapon = arsenal.getWeapon();
//        assertNotNull(weapon);
//     }
}
