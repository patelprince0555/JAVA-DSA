import java.util.Scanner;

public class practice_question {
    public static int average(int a,int b,int c){
        int average=(a+b+c)/3;
        return average;
    }

    public static boolean iseven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        // question 1
        System.out.println(average(100, 100, 100));



        // question 2
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number=sc.nextInt();
        if(iseven(number)){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is not even number");
        }
    }
}
