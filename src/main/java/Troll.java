public class Troll extends Player {

    private Arsenal arsenal;

    public Troll(String name, int healthPoints, Arsenal arsenal) {
        super(name, healthPoints);
        this.arsenal = arsenal;
    }
}