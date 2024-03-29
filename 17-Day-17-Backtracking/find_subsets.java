public class find_subsets {
    public static void findsubsets(String str ,int i,String ans){
        //  base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //  yes
        findsubsets(str, i+1, ans+str.charAt(i));
        // no
        findsubsets(str, i+1, ans);

    }
    public static void main(String[] args) {
        String str="abc";
        findsubsets(str, 0, "");

    }
}
