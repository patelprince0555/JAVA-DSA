public class practice_question {
    public static void printmaze(int maze[][]){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //  question 1 
        //  rat in a maze
        int maze[][]={{1,0,0,0},
                     {1,1,0,1},
                     {0,1,0,0},
                     {1,1,1,1}};
                     printmaze(maze);
    }
}
