import java.util.*;
public class Interleave_2_halves_of_Queue {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firsthalf =new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        interleave(q);
        while(!q.isEmpty()){
           System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
