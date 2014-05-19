package workshop6.PriorityQueueExample.DblokkerPQ;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/9/13
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args){
        PriorityQueue<DBlokker> deelnemers = new PriorityQueue<DBlokker>();

        DBlokker dBlokkerTom = new DBlokker("Tom", 120, false);
        DBlokker dBlokkerGuus = new DBlokker("Guus", 378, true);
        DBlokker dBlokkerYannick = new DBlokker("Yannick", 12, true);
        DBlokker dBlokkerYme = new DBlokker("Yme", 180, true);

        deelnemers.add(dBlokkerTom);
        deelnemers.add(dBlokkerGuus);
        deelnemers.add(dBlokkerYannick);
        deelnemers.add(dBlokkerYme);


        while(!deelnemers.isEmpty()){
            System.out.println(deelnemers.poll());
        }
    }

}
