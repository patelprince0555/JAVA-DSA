public class print_character_pattern {
    public static void main(String[] args) {
        // print character pattern
        // A
        // B C
        // D E F
        // G H I J

        int n = 4;
        char ch = 'A';
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
