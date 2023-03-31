/**
 * Химера
 */
public class Chimera extends Fish {
    private  int spead;
    public Chimera(String name, int spead) {
        super(name);
        this.spead = spead;
    }

    @Override
    public String waterType() {
        return "солёной";
    }

    @Override
    public String feed() {
        return "в основном мелкой рыбой, креветками и крабами";
    }

    @Override
    public int speadSwim() {
        return spead;
    }
}
