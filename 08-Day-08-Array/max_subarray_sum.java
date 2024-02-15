public class max_subarray_sum {

    public static void maxsubarraysum(int numbers[]){
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start; k<=end;k++){
                    currsum=currsum+numbers[k];
                }
                System.out.print(currsum+" ");
                if(currsum>maxsum){
                    maxsum=currsum;
                }
               
            }
        }
        System.out.println("max sum is= "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxsubarraysum(numbers);
    }
}
