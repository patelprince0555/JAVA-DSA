import java.util.Scanner;

public class assignment_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil");
        int pencil=sc.nextInt();
        System.out.println("Enter cost of pen");
        int pen= sc.nextInt();
        System.out.println("Enter cost of eraser");
        int eraser=sc.nextInt();
        int sum= pencil+pen+eraser;
        System.out.println("Total bill is "+sum);
        float newtotal= sum+ (0.18f*sum);
        System.out.println("your bill with tax is "+newtotal);
    }
    
}
