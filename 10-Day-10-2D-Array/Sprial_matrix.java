public class Sprial_matrix {
    public static void spiralprint(int matrix[][]){
        int startrow=0;
        int endrow =matrix.length-1;
        int startcols=0;
        int endcols=matrix[0].length-1;
        while(startrow<=endrow&&startcols<=endcols){
            for(int j=startcols;j<=endcols;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcols]+" ");
            }
            for(int j=endcols-1;j>=startcols;j--){
                System.out.print(matrix[endrow][j]+" ");
                if(startrow==endrow){
                    break;
                }
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcols]+" ");
                if(startrow==endcols){
                    break;
                }
            }
            startrow++;
            startcols++;
            endcols--;
            endrow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
 spiralprint(matrix);
        
    }
}
