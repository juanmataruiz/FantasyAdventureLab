import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Arsenal arsenal;

    @Before
    public void before() {
        arsenal = new Arsenal();
        dwarf = new Dwarf("Gimli", 100, arsenal);
    }

    @Test
    public void hasName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, dwarf.getHealthPoints());
    }

//    @Test
//    public void hasWeapon() {
//        assertEquals(arsenal, dwarf.arsenal.getWeapon());
//    }

//    @Test
//    public void canAddWeaponToDwarf() {
//        dwarf.addWeapon(arsenal);
//        assertEquals(1, dwarf.arsenal.getWeapon());
//    }
//
//    @Test
//    public void weaponIsAdded() {
//        dwarf.addWeapon(arsenal);
//        assertEquals(1, dwarf.getWeapons().size());
//    }


}
