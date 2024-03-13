public class print_numbers_in_ascending_order {
    public static void printascending(int n){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.print(n+" ");
        printascending(n+1);
    }
    public static void main(String[] args) {
        printascending(1);
        
    }
}
