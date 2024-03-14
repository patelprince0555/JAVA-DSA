public class Remove_Duplicates_in_a_string {
    public static void removeduplicates(String str ,int idx ,StringBuilder newstr ,boolean map[]){
        // base case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeduplicates(str, idx+1, newstr, map);
        }else{

            map[currchar-'a']=true;
            removeduplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="aapnaannccoleege";
        removeduplicates(str, 0,new StringBuilder(""), new boolean[26]);
        
    }
}
