import java.util.Scanner;

public class practice_question {
    public static void main(String[] args) {

        // question 1
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int number = sc.nextInt();
        // if (number>=0){
        //     System.out.println("it is positive number");
        // }
        // else{
        //     System.out.println("it i negstive number");
        // }


        // question 2 
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("you have a fever");
        // }
        // else{
        //     System.out.println("you have not fever");
        // }

        // question 3
        // int number = 3;
        // switch(number){
        //     case 1:
        //     System.out.println("monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesdsy");
        //     break;
        //     case 3:
        //     System.out.println("wednesday");
        //     break;
        //     case 4:
        //     System.out.println("thursday");
        //     break;
        //     case 5:
        //     System.out.println("friday");
        //     break;
        //     case 6:
        //     System.out.println("saturday");
        //     break;
        //     default:
        //     System.out.println("sunday");
        // }

        // question 4
        // int a = 63;
        // int b = 36;
        // String x =(a<b)? "true":"false";
        // String y = (a>b)?"a":"b";
        // System.out.println(x + y);



        // question 5
        System.out.println("Input the year");
        int year = sc.nextInt();

        boolean x=(year%4==0);
        boolean y = (year %100==0);
        boolean z = (year%400 == 0);

        if(x&&y&&z){
            System.out.println( year +" it is a leap year");
        }
        else{
            System.out.println( year + " it is not a leap year");
        }
    }
}
