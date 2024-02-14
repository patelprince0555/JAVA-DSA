import java.util.Scanner;

public class input_output_update {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phy marks:");
        marks[0]=sc.nextInt();
        System.out.println("Enter chem marks:");
        marks[1]=sc.nextInt();
        System.out.println("Enter math marks:");
        marks[2]=sc.nextInt();
        System.out.println("Enter eng marks:");
        marks[3]=sc.nextInt();

        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("math :"+marks[2]);
        System.out.println("eng :"+marks[3]);


        marks[3]=90;
        System.out.println("new eng marks :"+marks[3]);

        int percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println(percentage+"%");

    }
}
