public class practice_question {
    public static void main(String[] args) {
        // what will be output of this code
        vechicle obj1 =new car();
        obj1.print();

        vechicle obj2 = new vechicle();
        obj2.print();
    }
}

class vechicle{
    void print(){
        System.out.println("base class (vehicle)");
    }
}
class car extends vechicle{
    void print(){
        System.out.println("derived class (car)");
    }
}
