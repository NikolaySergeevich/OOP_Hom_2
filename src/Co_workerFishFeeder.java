public class Co_workerFishFeeder extends Co_worker implements SwimAble{
    private  int swimSpead;
    public Co_workerFishFeeder(String name, char gender, int age, int swimSpead) {
        super(name, gender, age);
        this.swimSpead = swimSpead;
    }

    @Override
    public String toString() {
        return String.format("%sСкорость плава: %d\n",super.toString(), speadSwim());
    }

    @Override
    public int speadSwim() {
        return swimSpead;
    }
}
