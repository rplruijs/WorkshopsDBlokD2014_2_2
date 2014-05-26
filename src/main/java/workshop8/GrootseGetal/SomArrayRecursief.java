package workshop8.GrootseGetal;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/16/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class SomArrayRecursief {

    public static void main(String[] args){

        int[] testData = {4, 6, 2, 3};
        System.out.println(somHelp(testData, 0));
    }


    private static int somHelp(int[] lijst, int start){
        if ( start == lijst.length - 1)   //basis
            return lijst[start];
        else {//recursie
            return lijst[start] +  somHelp (lijst, start+1);
        }
    }
}
