/**
 * Хрящевые
 */
public abstract class CartilaginousFish extends Fish{
    public CartilaginousFish(String name) {
        super(name);
    }

    @Override
    public String waterType() {
        return "солёной воде, а некоторые виды и в пресной";
    }
}
