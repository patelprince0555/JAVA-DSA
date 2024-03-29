public class Recursion_fibonacci {
    public static int fibo(int n){
        if(n==1||(n==0)){
            return n;
        }
        return fibo(n-1)*fibo(n-2);
    }
    public static void main(String[] args) {
        // so the time complexity of fibonacci is equal to o(2^n)

        // so the space complexity of fibonacci is equal to o(n)
    }
}
