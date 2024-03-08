public class constructors {
    public static void main(String[] args) {
        student s1=new student();
        student s2 =new student("prince");
        System.out.println(s2.name);
        student s3=new student(345);
        System.out.println(s3.roll);
        
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
        ;
    }
}
