public class multi_level_inheritance {
    public static void main(String[] args) {
        
    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


// Derived class 1
class mammal extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }


    
 // Derived class 2
}
class dog extends mammal{
    String bread;
}
