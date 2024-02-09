public class hollow_rectangle_pattern{
    public static void hollowrectangle(int totalcols,int totrows){
        // inner loop
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totalcols;j++){
                if(i==1||i==totrows||j==1||j==totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        // print hollow rectangle pattern
        // *****
        // *   *
        // *   *
        // *****
        hollowrectangle(4, 5);
        
    }
}