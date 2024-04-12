import java.util.*;
public class classroom{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3= new ArrayList<>();
// add function
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2,12);
        System.out.println(list);
        System.out.println(list.size());

        // print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

//  get function
        int element =list.get(1);
        System.out.println(element);

//  remove function
        list.remove(3);
        System.out.println(list);

 // set element
        list.set(0, 0);
        System.out.println(list);

// contain element
System.out.println(list.contains(12));
System.out.println(list.contains(0));

 

    }
}