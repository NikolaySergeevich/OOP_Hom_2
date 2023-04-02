import java.util.ArrayList;
import java.util.List;

public class Oceanarium {
    private List<Fish> ocean = new ArrayList<>();
    private  List<Co_workerFishFeeder> workers = new ArrayList<>();


    public void  addFish(Fish fish){
        this.ocean.add(fish);
    }
    public  void  addCo_worker(Co_workerFishFeeder worker){
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
        return slow;
    }

    public Co_worker swimSlowlyCo_w(){
        Co_workerFishFeeder slow = workers.get(0);
        for (Co_workerFishFeeder elem:workers) {
            if (elem.speadSwim() < slow.speadSwim()){
                slow = elem;
            }
        }
        return slow;
    }


}
