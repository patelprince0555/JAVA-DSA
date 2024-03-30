public class print_N_queens_1_solution {
    public static boolean issafe(char board[][],int row,int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='q'){
                return false;
            }
        }

        // diagonal leftup
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='q'){
                return false;
            }
        }
        // diagonal rightup
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nqueens(char board[][],int row){
        //  base case
        if(row==board.length){
            // printboard(board);
            return true;
        }

        // column loop
        for(int j=0;j<board.length;j++){
            if(issafe(board, row, j)){
                board[row][j]='q';
               if( nqueens(board, row+1)){
                return true;
               }
                board[row][j]='x';
            }
        }
        return false;
    }
    public static void printboard(char board[][]){
        System.out.println("___________chess board________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nqueens(board, 0)){
            System.out.println("solution is possible");
            printboard(board);
        }else{
            System.out.println("solution is not possible");
        }
      
    }
}
