public class print_x_power_n {
    public static int calpower(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=calpower(x, n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(calpower(2, 5));
        
    }
}
