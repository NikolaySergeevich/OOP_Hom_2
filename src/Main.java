public class Main {
    public static void main(String[] args) {
        Oceanarium ocean = new Oceanarium();
        Oceanarium workers = new Oceanarium();
        ocean.addFish(new Shark("Зубастик", 45));
        ocean.addFish(new Herring("Селька"));
        ocean.addFish(new Stingray("Стрела"));
        ocean.addFish(new Chimera("Химка", 16));
        ocean.addFish(new Salmon("Лосик-лососик"));
        ocean.addFish(new Catfish("Усач"));

        workers.addCo_worker(new Co_workerFishFeeder("Коля", 'M', 26, 2));
        workers.addCo_worker(new Co_workerFishFeeder("Света", 'Ж', 24, 1));
        ocean.showAllOcean();
        System.out.println("===========");
        workers.showAllCo_worker();
        System.out.println("===========");
        System.out.println(ocean.swimSlowlyFish());
    }
}