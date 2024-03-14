public class calculate_xpower_n_in_log_n {
    public static int optimizedpower(int a ,int n){
        if(n==0){
            return 1;
        }
        int halfpow=optimizedpower(a, n/2);
        int power=halfpow*halfpow;

        if(n%2!=0){
            power=a*power;
           
        }
        return power;
    }
    public static void main(String[] args) {
        System.out.println(optimizedpower(2, 5));
        
    }
}
