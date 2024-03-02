public class check_if_number_is_power_of_2_or_not {
    public static void checkpower(int n){
        if( (n &(n-1))== 0){
            System.out.println("it is power of 2");
        }
        else{
            System.out.println("it is not");
        }
    }
    public static void main(String[] args) {
        checkpower(8);
        
    }
}
