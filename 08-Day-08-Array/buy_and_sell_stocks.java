public class buy_and_sell_stocks {
    public static int buyandsellstocks(int numbers[]){
        int buyprice =Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<numbers.length;i++){
            if(buyprice<numbers[i]){
                int profit=numbers[i]-buyprice;
                maxpro=Math.max(maxpro, profit);
            }
            else{
                buyprice=numbers[i];
            }
        }
        return maxpro;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));
    }
    
}
