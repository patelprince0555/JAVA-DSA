import java.util.Scanner;

public class check_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("it is prime number");
        }
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("it is not a prime number");
                }
                else{
                    System.out.println("it is prime number");
                }
            }

        }
       
    }
}
