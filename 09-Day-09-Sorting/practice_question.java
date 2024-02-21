public class practice_question {

    public static void bubblesort(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]<num[j+1]){
                    int temp =num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }




    public static void slectionsort(int num1[]){
        for(int i=0;i<num1.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<num1.length;j++){
                if(num1[minpos]<num1[j]){
                    minpos=j;
                }
            }
            int temp=num1[minpos];
            num1[minpos]=num1[i];
            num1[i]=temp;
        }

    }


    public static void insertionsort(int num2[]){
        int n =num2.length;
        for(int i=1;i<n;i++){
            int j=i;
            while (j>0&&num2[j]>num2[j-1]){
                int temp=num2[j];
                num2[j]=num2[j-1];
                num2[j-1]=temp;
                j--;
            }
        }
    }


    public static void countingsort(int num3[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num3.length;i++){
            largest=Math.max(largest, num3[i]);
        }
        int count []=new int[largest+1];
        for(int i=0;i<num3.length;i++){
            count[num3[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                num3[j]=i;
                j++;
                count[i]--;
                
            }
        }
    }


    public static void print(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {

        // question 1
        // bubble sort arrange number in descending order
        // int numbers[]={5,4,3,1,2};
        // bubblesort(numbers);
        // print(numbers);
        


        //  question 2
        //  selection sort arrange number in descending order
        // int numbers1[]={5,4,1,3,2};
        // slectionsort(numbers1);
        // print(numbers1);


        // question 3
        // insertion sort arrange number in descending order
        // int numbers2[]={5,4,1,3,2};
        // insertionsort(numbers2);
        // print(numbers2);


        //  question 4
        // counting sort arrange number in descending order
        int numbers3[]={5,4,2,1,3};
        countingsort(numbers3);
        print(numbers3);

    }
}
