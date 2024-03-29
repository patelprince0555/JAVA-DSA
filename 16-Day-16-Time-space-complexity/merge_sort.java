public class merge_sort {
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid =si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        // merrge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        // so the time compplexity of the merge sort is equal to 0(nlogn)

         // so the space compplexity of the merge sort is equal to 0(n)
        
    }
}
