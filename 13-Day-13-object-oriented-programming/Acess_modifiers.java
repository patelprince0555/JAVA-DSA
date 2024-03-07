public class Acess_modifiers{
    public static void main(String[] args) {
        bankacount myacc=new bankacount();
        myacc.username="princepatel";
        // myacc.password="prince";  // This is not valid because it is private class
    }
}

class bankacount{
    String username;
   private String password;
   void setpassword(String pwd){
    password=pwd;
   }
}