public class Tiling_problem {
    public static int Tilingproblem(int n){
        // base case
        if(n==0||n==1){
            return 1;
        }
        // vertical choice
        int fnm1 =Tilingproblem(n-1);
        int fnm2=Tilingproblem(n-2);
        int totalways =fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(Tilingproblem( 4));
        
    }
}
