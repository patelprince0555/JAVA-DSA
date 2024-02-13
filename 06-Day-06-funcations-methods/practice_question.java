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

    public static int ispalindrome(int n){
        int reverse=0;
       while(n!=0){
        int lastdigit = n%10;
        reverse=reverse*10+lastdigit;
        n=n/10;
       }
       return reverse;
    }


    public static int thesumofdigit(int n){
        int sum=0;
        while(n>0){
            int lastdigit =n%10;
            sum = sum+lastdigit;
            n=n/10;
        }
        return sum;
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


        // question 3
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        if(ispalindrome(number1)==number1){
            System.out.println("number:"+number1+"is a palindrome");
        }else{
            System.out.println("number:"+number1+"is not a palindrome");
        }


        // question 4
     // math.min()   it is used to return the smallest of two values
    //math.max()    it returns the largest of two values
    // math.sqrt()  it is used to return the square root of a number
    //math.pow()    it returns the value of first argument raised to the power to second argument
    //math.avg()    This function is used to get the average value from the given expression.
    // math.abs()   it will return the absolute value of the given value


    //  question 5
    System.out.println(thesumofdigit(121));

    }
}
