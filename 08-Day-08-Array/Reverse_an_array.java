public class Reverse_an_array {
    public static void reversearray(int numbers[]){
        int first =0;
        int last = numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,4,5,7,9,10};
        reversearray(numbers);
        for(int i= 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
