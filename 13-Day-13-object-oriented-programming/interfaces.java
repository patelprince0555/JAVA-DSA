public class interfaces {
    public static void main(String[] args) {
        king q = new king();
        q.moves();
        
    }
}

interface cheeseplayer{
    void moves();
}

class queen implements cheeseplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 dirms)");
    }
}

class rook implements cheeseplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class king implements cheeseplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
