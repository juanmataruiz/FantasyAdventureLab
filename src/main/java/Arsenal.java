import java.util.ArrayList;

public class Arsenal {

    private ArrayList<Weapon> weapons;

    public Arsenal(){
        weapons = new ArrayList<>();
        generateArsenal();
    }


    public int getNumberOfWeapons() {
        return weapons.size();
    }

   private void generateArsenal(){
        for(WeaponType weaponType : WeaponType.values()){
            weapons.add(new Weapon(weaponType));
        }
    }
}
