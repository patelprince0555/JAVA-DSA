public class decimal_to_binary {
    public static int dectobin(int n){
        int binnum=0;
        int pow=0;
        while(n>0){
            int rem = n%2;
            binnum=binnum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        return binnum;
        

    }
    public static void main(String[] args) {
        System.out.println(dectobin(5));
        
    }
}
