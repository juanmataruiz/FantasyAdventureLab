public enum WeaponType {

    SWORD(25),
    AXE(50),
    SPIKE(75);

    private int power;

    WeaponType(int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }

}
