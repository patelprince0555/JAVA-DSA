public class Search_in_matrix {

    public static boolean searchmatrix(int matrix[][] , int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println(" The key is"+"("+i+","+j+")");
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2},{2,3},{5,6}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        searchmatrix(matrix, 5);
        
    }
}
