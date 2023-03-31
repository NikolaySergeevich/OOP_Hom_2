public abstract class Fish implements SwimAble {
    private String name;

    public Fish(String name) {
        this.name = name;
    }
    public abstract String waterType();
    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Имя рыбы: %s\n", this.name))
                .append(String.format("Обиатет в %s воде.\n",waterType()))
                .append(String.format("Питаются %s.\n",feed()))
                .append(String.format("Скорость: %d км/ч\n", speadSwim()));
        return res.toString();
    }
}