public class Backtracking_Arrays{

    public static void changearr(int arr[],int i,int val){
        // base case
        if(i==arr.length){
            printarr(arr);
            return;
        }
        // recursion
        arr[i]=val;
        changearr(arr, i+1, val+1);// function call step
        arr[i]=arr[i]-2;// backtracking step
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        changearr(arr, 0, 1);
        printarr(arr);


        //  Time complexity is equal to o(n)
        //  Space complexity is also equal to o(n)
    }
}