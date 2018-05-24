public class Weapon {

    private WeaponPower weaponPower;

    public Weapon(WeaponPower weaponPower){
        this.weaponPower = weaponPower;
    }

    public int getValue() {
        return this.weaponPower.getPower();
    }
}
