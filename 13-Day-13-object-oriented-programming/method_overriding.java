public class method_overriding {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
        
    }
}
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
