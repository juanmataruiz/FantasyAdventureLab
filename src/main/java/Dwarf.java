import java.util.BitSet;

public class Dwarf extends Player {

    private Arsenal arsenal;

    public Dwarf(String name, int healthPoints, Arsenal arsenal) {
        super(name, healthPoints);
        this.arsenal = arsenal;
    }


}
