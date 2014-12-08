package workshop6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/11/13
 * Time: 10:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class Vraag {

    public static void main(String[] args){
        Queue<String> namen = new LinkedList();
        Stack<String> namen2 = new Stack();

        namen.add("Thom");
        namen.add("Mees");

        namen2.push("Yannick");
        namen2.push("Yme");
        namen2.push("Guus");

        namen.remove();
        namen.add(namen2.peek());

        String name = namen2.pop();

        while(!namen.isEmpty()){
            System.out.println(namen.poll());
        }

        while(!namen2.isEmpty()){
            System.out.println(namen2.pop());
        }

        System.out.println(name);


    }
}
