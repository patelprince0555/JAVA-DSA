public class Sodoku {

    public static boolean issafe(int sudoku[][],int row,int col,int digits){
        // column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digits){
                return false;
            }
        }

        // row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digits){
                return false;
            }
        }
        // grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digits){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokusolver(int sudoku[][],int row,int col){
        // base case
        // recursion
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokusolver(sudoku, nextrow, nextcol);
        }
        for(int digits=1;digits<=9;digits++){
            if(issafe(sudoku ,row ,col,digits)){
                sudoku[row][col]=digits;
                if(sudokusolver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printsudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
    if(sudokusolver(sudoku, 0, 0)){
        System.out.println("solution exists");
        printsudoku(sudoku);
    }else{
        System.out.println("solution does not exists");
    }
    }
}
