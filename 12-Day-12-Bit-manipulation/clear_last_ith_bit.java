public class clear_last_ith_bit {
    public static int clearlastbit(int n , int i){
        int bitmask =(-1)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastbit(15, 2));
        
    }
}
