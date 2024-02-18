public class Slection_sort {
    public static void selectionsort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        selectionsort(numbers);
        printarr(numbers);
    }
}
