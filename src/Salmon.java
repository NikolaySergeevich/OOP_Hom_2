/**
 * Лосось
 */
public class Salmon extends DonyFish{
    public Salmon(String name) {
        super(name);
    }

    @Override
    public String waterType() {
        return "Солёной воде, может мигрировать в реки для нереста";
    }

    @Override
    public String feed() {
        return "фитопланктоном";
    }

    @Override
    public int speadSwim() {
        return 15;
    }
}
