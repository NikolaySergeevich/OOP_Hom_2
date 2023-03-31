/**
 * Скат
 */
public class Stingray extends CartilaginousFish {
    public Stingray(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "преимущественно мелкой рыбой и крабами";
    }

    @Override
    public int speadSwim() {
        return 23;
    }
}
