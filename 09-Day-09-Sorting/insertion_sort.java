public class insertion_sort {
    public static void insertionsort(int arr[]){
        int  n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while (j>0&&arr[j]<arr[j-1]) {
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
    public static void print(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");

        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        insertionsort(numbers);
        print(numbers);

    }
}
