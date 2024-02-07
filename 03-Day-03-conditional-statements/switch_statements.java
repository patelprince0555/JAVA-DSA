import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operators");
        char operators=sc.next().charAt(0);
        switch (operators) {
            case '+' :
            System.out.println(a+b);
                break;
           case '-':
           System.out.println(a-b);
                break;
           case '*':
           System.out.println(a*b);
                 break;
           case '/':
            System.out.println(a/b);
                break;
                default:
                System.out.println("wrong operator");
        }
    }
}
