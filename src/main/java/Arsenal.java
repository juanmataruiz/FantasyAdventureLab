import java.util.ArrayList;
import java.util.Collections;

public class Arsenal {

    private ArrayList<Weapon> weapons;

    public Arsenal(){
        weapons = new ArrayList<>();
        //generateArsenal();
        //shuffle();
    }


    public int getNumberOfWeapons() {
        return weapons.size();
    }

//   private void generateArsenal(){
//        for(WeaponType weaponType : WeaponType.values()){
//            weapons.add(new Weapon(weaponType));
//        }
//    }

    private void canAddWeapon() {

    }

    public void shuffle() {
        Collections.shuffle(weapons);
    }

    public Weapon getWeapon() {
        return weapons.remove(0);
    }
}
