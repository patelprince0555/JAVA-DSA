public class inverted_half_pyramid {
    public static void inverted_halfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            for(int j=1;j<i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // print inverted half-pyramid with numbers
        // 12345
        // 1234
        // 123
        // 12
        // 1
        inverted_halfpyramid(5);
    }
}
