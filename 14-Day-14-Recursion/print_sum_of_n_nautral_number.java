public class print_sum_of_n_nautral_number {
    public static int calsum(int n){
        if(n==0){
            return 0;
        }
        int snm1=calsum(n-1);
        int sum=snm1+n;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calsum(5));
        
    }
}
