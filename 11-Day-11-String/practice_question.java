import java.util.Scanner;

public class practice_question {

    public static void lowercasevovels(String str){
        int count =0;
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        //  question 1
        // count how many times lowercase vowels occured in a string entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String sb=sc.nextLine();
        lowercasevovels(sb);


        //  question 3
        String str ="Apnacollege".replace("l","");
        System.out.println(str);
        // The replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced.

    }
}
