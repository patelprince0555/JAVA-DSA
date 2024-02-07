import java.util.Scanner;

public class print_odd_or_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        if(number%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("It is odd number");
        }
    }
    
}
