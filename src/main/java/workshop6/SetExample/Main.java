package workshop6.SetExample;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by remcoruijsenaars on 19/05/14.
 */
public class Main {

    public static void main(String[] args) {
        Set<Blok> blokken = new HashSet();

        Blok blokD = new Blok(4, "Dblok");
        Blok blokD2 = new Blok(4, "Dblok");
        Blok blokC = new Blok(3, "Dblok");



        blokken.add(blokC);
        blokken.add(blokD);
        blokken.add(blokD2);
        blokken.add(blokC);


        System.out.println(blokken.size());


    }
}
