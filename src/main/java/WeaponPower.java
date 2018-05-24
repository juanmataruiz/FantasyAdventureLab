public enum WeaponPower {

    SWORD(25),
    AXE(50),
    SPIKE(75);

    private int power;

    WeaponPower(int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }

}
