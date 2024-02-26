import java.util.Arrays;
import java.util.Scanner;

public class practice_question {

    // question 1

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

//  question 4

    public static void anagrams(String str,String str1){

        str=str.toLowerCase();
        str1=str1.toLowerCase();
        if(str.length()==str1.length()){
            char strarray[]=str.toCharArray();
            char str1array[]=str1.toCharArray();

            Arrays.sort(strarray);
            Arrays.sort(str1array);
           if(Arrays.equals(strarray, str1array)){
            System.out.println("it is a anagrams");
           }
           else{
            System.out.println("it is not anagram");
           }
        }else{
            System.out.println("it is not anagrams");
        }
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





        // Determine if 2 Strings are anagrams of each other
        // question 4
        String str1 ="earth";
        String str2 ="hearrt";
        anagrams(str2, str1);

    }
}
