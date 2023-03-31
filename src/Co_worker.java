public abstract class Co_worker {
    private String name;
    private char gender;
    private int age;

    public Co_worker(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\nПол: %c\nВозраст: %d\n", this.name,this.gender,this.age);
    }
}
