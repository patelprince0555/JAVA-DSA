public class Practice_question {
    //  question 1
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






    //  question 3
    public static int buyandsellstocks(int numbers[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<numbers.length;i++){
            if(buyprice<numbers[i]){
                int profit =numbers[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyprice=numbers[i];
            }
            
        }
        return maxprofit;
    }



    public static void rotation(int numbers[]){

    }
    public static void main(String[] args) {
        //  question 1
        int nums[]={1,2,3,1};
        System.out.println(checknumber(nums));





        //  question 2
        int nums1[]={4,5,6,7,0,1,2};




        //  question 3
        int prices[] ={7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));

        int prices2[]={7,6,4,3,1};
        System.out.println(buyandsellstocks(prices2));

    }
}
