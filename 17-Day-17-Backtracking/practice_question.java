public class practice_question {
    public static boolean issafe(int maze[][],int x,int y){
        return (x>=0 &&  x<maze.length && 
                 y>=0 && y<maze.length && maze[x][y]==1);
    }

    public static boolean solvemaze(int maze[][]){
        int n=maze.length;
        int sol[][]= new int[n][n];
        if(solvemazeutil(maze,0,0,sol)==false){
            System.out.println("soution doesn,t exist");
            return false;
        }
        printmaze(sol);
        return true;
    }

    public static boolean solvemazeutil(int maze[][],int x,int y,int sol[][]){
        if(x==maze.length-1&&y==maze.length-1&& maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        // check if maze [x][y] is valid
        if(issafe(maze, x, y)==true){
            if(sol[x][y]==1)
            return false;
            sol[x][y]=1;
            if(solvemazeutil(maze, x+1, y, sol))
            return true;
            if(solvemazeutil(maze, x, y+1, sol))
            return true;
            sol[x][y]=0;
            return false;
        }
        return false;
    }
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
                    solvemaze(maze);
    }
}
