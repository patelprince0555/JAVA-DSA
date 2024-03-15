public class practice_question {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};


    // public static void alloccurance(int arr[],int key,int i){
    //     if(i==arr.length){
    //         return;
    //     }
    //     if(arr[i]==key){
    //         System.out.print(i+" ");
    //     }
    //     alloccurance(arr, key, i+1);
    // }


    public static void printdigits(int number){
        if(number==0){
            return;
        }
        int lastdigit=number%10;
        printdigits(number/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        //  question 1
        // find the all occurance of given element
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // alloccurance(arr, 2, 0);

        //  quetion 2
        // you are given a number (eg 2018) convert it into string of english like "two zero one nine"
        int number=1947;
        printdigits(number);
    }
}
