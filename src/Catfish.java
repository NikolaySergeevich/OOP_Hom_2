/**
 * Сом
 */
public class Catfish extends DonyFish {
    public Catfish(String name) {
        super(name);
    }

    @Override
    public String waterType() {
        return "пресной";
    }

    @Override
    public String feed() {
        return "мелкие ракообразные, мальки и водные насекомые";
    }

    @Override
    public int speadSwim() {
        return 9;
    }
}
