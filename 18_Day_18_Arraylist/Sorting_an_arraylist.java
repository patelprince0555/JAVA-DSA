import java.util.*;
public class Sorting_an_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(5);
        System.out.println(list);
        // for ascending order
        Collections.sort(list);
        System.out.println(list); 

        // for descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
