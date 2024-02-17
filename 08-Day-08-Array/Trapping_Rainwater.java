public class Trapping_Rainwater {
    public static int trappedwater(int numbers[]){
        // left max boundary
        int n =numbers.length;
        int left[]=new int[n];
        left[0]=numbers[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(numbers[i],left[i-1]);
        }
        // right max boundary
        int right[]=new int[n];
        right[n-1]=numbers[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(numbers[i], right[i+1]);
        }
        int trappedwater =0;
        // loop
        for(int i =0;i<n;i++){
             // waterlevel
             int waterlevel =Math.min(left[i], right[i]);
              //  trapped water
              trappedwater=trappedwater+waterlevel-numbers[i];
        }
       
       return trappedwater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
       System.out.println(trappedwater(height));
        
    }
}
