public class static_keyword {
    public static void main(String[] args) {

        student s1 =new student();
        s1.schoolname="jnm";

        student s3= new student();
        s3.schoolname="convent of gagan bharti";
        
        student s2 =new student();
        System.out.println(s2.schoolname);


        
    }
}
class student{
    String name;
    int roll;


    static String schoolname;

    void setname(String name){
        this.name=name;
    }

    String getname(){
        return this.name;
    }
}
