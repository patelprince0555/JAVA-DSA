import java.util.*;
public class Smallest_number {
    public static int getsmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        System.out.println(getsmallest(numbers));
        
    }
}
