/**
 * Акула
 */
public class Shark extends CartilaginousFish{
    private  int spead;
    public Shark(String name, int spead) {
        super(name);
        this.spead = spead;
    }

    @Override
    public String feed() {
        return "рыбой, кальмарами, иногда даже птицами и млекопитающими";
    }

    @Override
    public int speadSwim() {
        return spead;
    }
}
