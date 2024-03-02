public class practice_question {
    public static void swapnumber(int x,int y){
        System.out.println("before swap :x = "+ x + " and y = "+y);
        // swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("after swap :x = "+x+" and y = "+y);
    }
    public static void main(String[] args) {
        // question 2
        // Swap two numbers without using any third variable
        swapnumber(4, 3);



        // convert upparcase to lowercase
        // question 4
        for(char ch ='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
