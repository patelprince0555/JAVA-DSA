import java.util.Scanner;

public class continue_statement {
    public static void main(String[] args) {
        // Disply all numbers enterd by user except multiples of 10

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println("number was: "+n);
        }
        while(true);
        
    }
}
