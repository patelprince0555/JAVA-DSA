public class print_star_pattern{
    public static void main(String[] args) {
        // print
        // *
        // **
        // ***
        // ****

        int n = 4;
        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}