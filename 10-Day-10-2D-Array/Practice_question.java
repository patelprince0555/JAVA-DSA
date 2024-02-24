public class Practice_question {

    //  question 1 function
    public static void countof7(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("count of 7 is :"+ count);
    }




    //  question 2 function
    public static void sumofnumbers(int matrix[][]){
        int sum=0;
        for(int i=1;i<=1;i++){
            for(int j= 0;j<matrix[0].length;j++){
                sum=sum+matrix[i][j];
            }
        }
       System.out.println(sum);
    }



    
    public static void main(String[] args) {


        // question 1
        int array[][]={{4,7,8},
                      {8,8,7}};
                      countof7(array);


      // question 2
      int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
      sumofnumbers(nums);


    //   question 2

    }
}
