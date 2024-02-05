import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        float rad = s.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println(area);

    }
}
