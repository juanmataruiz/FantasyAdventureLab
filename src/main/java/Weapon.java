public class Weapon {

     WeaponType weaponType;

    public Weapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }

    public int getValue() {
        return this.weaponType.getPower();
    }
}
