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


    //  question 4;
    public static int trappedwater(int numbers[]){
        int n = numbers.length;
        int left[]=new int[n];
        left[0]=numbers[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(numbers[i], left[i-1]);
        }

        int right[]=new int[n];
        right[n-1]=numbers[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(numbers[i],right[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<n;i++){
            int waterlabel=Math.min(left[i], right[i]);
            trappedwater=trappedwater+waterlabel-numbers[i];
        }
        return trappedwater;
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






        //  question 4
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedwater(height));





        
        //  question 5


    }
}
