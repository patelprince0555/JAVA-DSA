public class zero_one_triangle {
    public static void zeroonetriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // o-1 triangle
        // 1
        // 01
        // 101
        // 0101
        // 10101
        zeroonetriangle(5);
        
    }
}
