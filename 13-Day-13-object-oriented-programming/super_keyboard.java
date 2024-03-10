public class super_keyboard {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
        
    }
}
class Animal{

    String color;
    Animal(){
        System.out.println("animal constuctor is called");

    }
}

class horse extends Animal {
    horse(){
        super.color="red";
        System.out.println("horse constuctor is called");
    }
}
