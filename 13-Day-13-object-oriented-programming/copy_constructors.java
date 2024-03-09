public class copy_constructors {
    public static void main(String[] args) {
        student s1=new student();
        
    }
}

class student {
    String name;
    int roll;

    student(){
        System.out.println("constructor is called");
    }
    student(String name){
        this.name=name;
    }
    student(int roll){
        this.roll=roll;
    }
}
