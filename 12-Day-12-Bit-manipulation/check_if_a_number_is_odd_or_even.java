public class check_if_a_number_is_odd_or_even {
    public static void evenorodd(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is a odd number");
        }
    }
    public static void main(String[] args) {
        evenorodd(6);
        
    }
}
