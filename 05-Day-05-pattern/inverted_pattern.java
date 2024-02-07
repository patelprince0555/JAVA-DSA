public class inverted_pattern {
    public static void main(String[] args) {
        // print inverted star pattern
        // ****  
        // *** 
        // **
        // *

        int n = 4;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=(4-i+1);j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
