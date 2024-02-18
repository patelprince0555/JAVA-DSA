public class Practice_question {
    public static boolean checknumber(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }

        }
        return false;
    }



    public static void rotation(int numbers[]){
        
    }
    public static void main(String[] args) {
        //  question 1
        int nums[]={1,2,3,1};
        System.out.println(checknumber(nums));


        //  question 2
        int nums1[]={4,5,6,7,0,1,2};

    }
}
