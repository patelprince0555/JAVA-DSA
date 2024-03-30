public class N_queens {
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

    public static void nqueens(char board[][],int row){
        //  base case
        if(row==board.length){
            printboard(board);
            return;
        }

        // column loop
        for(int j=0;j<board.length;j++){
            if(issafe(board, row, j)){
                board[row][j]='q';
                nqueens(board, row+1);// function call
                board[row][j]='x';//backtracking
            }
        }
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
        nqueens(board, 0);
    }
}
