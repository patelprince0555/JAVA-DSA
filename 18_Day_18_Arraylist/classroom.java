import java.util.*;
public class classroom{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        int element =list.get(1);
        System.out.println(element);

        list.remove(3);
        System.out.println(list);
        
    }
}