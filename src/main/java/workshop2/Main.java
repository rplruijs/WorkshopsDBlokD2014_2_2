package workshop2;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/24/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        Student s1 = new Student("9807926" , "Remco");
        Student s2 = new Student("1020344" , "Guus");
        double c1 = 10; double c2 = 8.4;
        TentamenResultaat t1 = new TentamenResultaat(c1, s1);
        TentamenResultaat t2 = new TentamenResultaat(c2, s2);
        t1 = t2;
        s2.setNaam("Guzie");
        c2 = 5.6;
        System.out.println(t1);
        System.out.println(t2);

        Student s = new Student("8787234", "Tom");

        System.out.println(s);

    }
}
