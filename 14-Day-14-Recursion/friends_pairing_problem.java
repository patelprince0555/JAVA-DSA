public class friends_pairing_problem {
    public static int pairingproblem(int n){
        // base case
        if(n==1||n==2){
            return n;
        }
        // single pairing
        int fnm1=pairingproblem(n-1);
        //  double pairing
        int fnm2=pairingproblem(n-2);
        int pairways =fnm2*(n-1);

        int totalways=pairways+fnm1;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(pairingproblem(3));
        
    }
}
