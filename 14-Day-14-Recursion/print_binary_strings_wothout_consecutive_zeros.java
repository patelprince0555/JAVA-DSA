public class print_binary_strings_wothout_consecutive_zeros {
    public static void printbinstrings(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinstrings(n-1, 1, str+"1");
        if(lastplace==1){
            printbinstrings(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        printbinstrings(3, 1, "");
        
    }
}
