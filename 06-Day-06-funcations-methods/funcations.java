import java.util.Scanner;

public class funcations{

    public static void printhello(){
        System.out.println("hello world");
    }

    public static int  calculatesum( int a, int b){ // formal parameters
        int sum = a+b;
        return sum;
      
       
    }
    public static void main(String[] args) {
        printhello();
        printhello();


        // synatx with parameters
        // Add two number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b); // actual parameters
        System.out.println(sum);
       
      
    }
}