public class Search_iterative {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        // step 1= create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail=newNode;
            return ;

        }
        // step 2 newnode next= head
        newNode.next=head;

        // step 3 head = newnode
        head= newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail=newNode;
            return ;

        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head  ==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp =temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public static void main(String[] args) {

        Search_iterative ll =new Search_iterative();
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();

        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(10));
        
    }
}
