import java.util.Scanner;

public class practice_questions {
    public static void main(String[] args) {

        // question 1
        for(int i=1;i<5;i++){
            System.out.println("Hello");
            i+=2;
        }


        // question 2
        // Scanner sc = new Scanner(System.in);
        // int number;
        // int choice;
        // int evensum =0;
        // int oddsum =0;

        // do{
        //     System.out.println("enter the number");
        //     number= sc.nextInt();
        //     if(number%2==0){
        //         evensum = evensum+number;
        //     }
        //     else{
        //         oddsum=oddsum+number;
        //     }
        //     System.out.println("do you want to continue ? press 1 for yes or 0 for no");
        //     choice=sc.nextInt();
        // }
       
        // while(choice==1);
        // System.out.println("sum of even numbers: "+evensum);
        // System.out.println("sum of odd numbers:"+oddsum);


        // question 3
        // write a program to find the factorial of any number entered by user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int number;
        // int factorial =1;
        // number = sc.nextInt();
        // for(int n=1;n<=number;n++){
        //     factorial= factorial*n;
        // }
        // System.out.println(factorial);


        // question 4
        // write a program to print the multiplication table of anumber N , enterd by the user
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+ i +"="+(num*i));
        }
        System.out.println();

        // question 5
        // for(int i =0; i<=5;i++){
        //     System.out.println("i ="+i);
        // }
        // System.out.println(" i after the loop =" + i);
        // in this question error is is i 




        

    }
}
