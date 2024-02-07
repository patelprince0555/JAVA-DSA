import java.util.Scanner;

public class print_number_from_1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println("printed number from 1 to n");
    }
}
