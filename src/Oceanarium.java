import java.util.ArrayList;
import java.util.List;

public class Oceanarium {
    private List<Fish> ocean = new ArrayList<>();
    private  List<Co_worker> workers = new ArrayList<>();

//    public Oceanarium() {
//        this.ocean = ocean;
//    }
    public void  addFish(Fish fish){
        this.ocean.add(fish);
    }
    public  void  addCo_worker(Co_worker worker){
        this.workers.add(worker);
    }

    public  void  showAllOcean(){
        for (Fish elem: ocean) {
            System.out.println(elem);
        }
    }
    public  void  showAllCo_worker(){
        for (Co_worker elem: workers) {
            System.out.println(elem);
        }
    }
    public Fish swimSlowlyFish(){
        Fish slow = ocean.get(0);
        for (Fish elem:ocean) {
            if (elem.speadSwim() < slow.speadSwim()){
                slow = elem;
            }
        }
        System.out.printf("Самая медленая рыба в океанариуме:\n",slow);
        return slow;
    }
}
