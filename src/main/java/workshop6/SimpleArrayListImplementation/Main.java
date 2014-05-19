package workshop6.SimpleArrayListImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/9/13
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        MyArrayList<String> namen = new MyArrayList<String>();

        namen.add("Remco");
        namen.add("Helen");
        namen.add("Tamara");
        namen.add("Duco");


        List<String> namen2 = new ArrayList();
        namen2.add("Remco");
        namen2.add("Helen");
        namen2.add("Tamara");
        namen2.add("Duco");



//Veroorzaakt ConcurrentModificationException

//        for(String naam : namen2){
//            if(naam.equals("Remco")){
//                namen2.remove(naam);
//            }
//        }                           namen.add("Remco");



        Iterator<String> iterator = namen.iterator();

        while(iterator.hasNext()){
            String naam = iterator.next();

            if(naam.equals("Duco")){
                iterator.remove();
            }
        }

        for(String naam : namen){
            System.out.println(naam);
        }

    }
}
