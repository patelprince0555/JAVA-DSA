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



    //  question 3 function
    public static void transpose(int matrix[][]){
        int row =matrix.length;
        int col = matrix[0].length;
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(transpose);

    }

    public static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
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
      int matrix[][]={{2,3,7},{5,6,7}};
      transpose(matrix);
    }
}
