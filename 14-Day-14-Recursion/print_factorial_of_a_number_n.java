public interface print_factorial_of_a_number_n {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=n*fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        
    }
}
