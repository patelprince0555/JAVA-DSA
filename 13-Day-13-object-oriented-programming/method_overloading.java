public class method_overloading {
    public static void main(String[] args) {
        calculator sc=new calculator();
        System.out.println(sc.sum(2,4));
        System.out.println(sc.sum(4.5f, 4.6f));
        System.out.println(sc.sum(3.5f, 5.5f, 1.0f));
        
    }
}

class calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    float sum(float a,float b,float c){
        return a+b;
    }
}
