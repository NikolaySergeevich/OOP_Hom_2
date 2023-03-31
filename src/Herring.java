/**
 * Сельдь
 */
public class Herring extends  DonyFish {
    public Herring(String name) {
        super(name);
    }

    @Override
    public String waterType() {
        return "основном в солёной";
    }

    @Override
    public String feed() {
        return "мелкой рыбой, моллюсками и креветками";
    }
}
