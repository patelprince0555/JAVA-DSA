public class print_numbers_in_ascending_order {
    public static void printascending(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printascending(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printascending(20);
        
    }
}
