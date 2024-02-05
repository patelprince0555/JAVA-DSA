public class Type_promotion {
    public static void main(String [] args){
       // char a = 'a';
        //char b = 'b';
        //char c = (char) (a+b);

       // short a = 5;
        //byte b = 25;
        //char c = 'c';
        //byte bt = (byte) (a+b+c);
       // System.out.println((int)(a));
        //System.out.println((int)(b));
        //System.out.println(a+b);
       // System.out.println(a+b+c);
        //System.out.println(bt);
        byte b = 5;
        byte a = (byte) (b*2);
        System.out.println(a);
    }
}
