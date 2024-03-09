public class Abstract_class {
    public static void main(String[] args) {
        horse s =new horse();
        s.walks();
        System.out.println(s.color);

        chicken c = new chicken();
        c.walks();
        
    }
}
abstract class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    Animal(){
        color="brown";
    }
    abstract void walks();
}
class horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walks(){
        System.out.println("walks on 4 leg");
    }
}

class chicken extends Animal{
    void changecolor(){
        color="green brown";
    }
    void walks(){
        System.out.println("walks on 2 leg");
    }
}
