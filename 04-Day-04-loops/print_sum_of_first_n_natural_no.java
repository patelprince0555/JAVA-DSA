import java.util.Scanner;

public class print_sum_of_first_n_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc .nextInt();
        int counter = 0;
        int sum= 0;
        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
        System.out.println("sum is:  "+sum);
        System.out.println("printed sum of first n natural number");
    }
}
