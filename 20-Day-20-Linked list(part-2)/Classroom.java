import java.util.*;
public class Classroom {
    public static void main(String[] args) {
        // create -objects, int ,float, boolean ->Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(0);
        System.out.println(ll);
        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
    }
}
