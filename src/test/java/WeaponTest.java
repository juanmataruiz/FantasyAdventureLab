import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(WeaponPower.AXE);

    }

    @Test
    public void weaponHasValue(){
        assertEquals(50, weapon.getValue());
    }
}
