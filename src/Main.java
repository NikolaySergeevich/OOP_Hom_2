import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Oceanarium fish = new Oceanarium();
        Oceanarium workers = new Oceanarium();


        fish.addFish(new Shark("Зубастик", 45));
        fish.addFish(new Herring("Селька"));
        fish.addFish(new Stingray("Стрела"));
        fish.addFish(new Chimera("Химка", 16));
        fish.addFish(new Salmon("Лосик-лососик"));
        fish.addFish(new Catfish("Усач"));


        workers.addCo_worker(new Co_workerFishFeeder("Коля", 'M', 26, 2));
        workers.addCo_worker(new Co_workerFishFeeder("Света", 'Ж', 24, 1));


        fish.showAllOcean();
        System.out.println("===========");
        workers.showAllCo_worker();
        System.out.println("===========");
        System.out.printf("Самая медленная рыба в океанариуме:\n");
        System.out.println(fish.swimSlowlyFish());
        System.out.printf("Самый медленный человек в океанариуме:\n");
        System.out.println(workers.swimSlowlyCo_w());
        System.out.println("----------------");
        slowSwimOfAll(fish, workers);


    }
    public static void slowSwimOfAll(Oceanarium oc, Oceanarium wo){
        List<SwimAble> lis = new ArrayList<>();
        lis.add(oc.swimSlowlyFish());
        lis.add((SwimAble) wo.swimSlowlyCo_w());
        SwimAble res = lis.get(0);
        for (SwimAble el:lis) {
            if (el.speadSwim() < res.speadSwim()){
                res = el;
            }
        }
        System.out.println("Самая медленная скорость из всех, кто умеет плавать в окуанариуме:");
        if (res instanceof Fish){
            System.out.println((Fish) res);
        }else System.out.println((Co_worker) res);
    }



}