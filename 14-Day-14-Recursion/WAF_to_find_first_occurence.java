public class WAF_to_find_first_occurence {
    public static int firstoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return-1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[]={3,2,4,5,3,4,6};
        System.out.println(firstoccurence(arr, 4, 0));
        
    }
}