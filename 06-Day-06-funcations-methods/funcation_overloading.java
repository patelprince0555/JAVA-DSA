public class funcation_overloading {

    public static int sum(int a , int b){
        int sum =a+b;
        return sum;
    }

    public static float sum(float a, float b){
        float sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum (3.5f, 4.5f));
        
    }
}
