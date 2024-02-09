public class palindromic_pattern {
    public static void palindromic(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print("");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        palindromic(5);
    }
}
