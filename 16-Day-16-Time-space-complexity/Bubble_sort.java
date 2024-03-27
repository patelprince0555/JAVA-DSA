public class Bubble_sort {
    public static void bubblesort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //  so the time complexity of bubble sort in wrost case is equal to o(n^2)
        
         //  so the time complexity of bubble sort in best case is equal to o(n^2)
    }
    public static void main(String[] args) {
        
    }
}
