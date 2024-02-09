public class Binary_to_decimal {
    public static int binarytodecimal(int n){
        int pow=0;
        int decnum=0;
        while(n>0){
            int lastdigit=n%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        return decnum;
    }
    public static void main(String[] args) {
        System.out.println(binarytodecimal(101));
    }
}
