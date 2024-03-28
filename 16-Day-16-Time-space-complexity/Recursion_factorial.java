public class Recursion_factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        //  so the time complexity is equal to o(n)

        // so the space complexity is equal to 0(n)
        
    }
}
