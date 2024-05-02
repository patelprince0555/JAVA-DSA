public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addfirst(int data){
        Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
             newNode.next=head;
             head.prev=newNode;
             head=newNode;
        }

        // remove
        public int removefirst(){
            if(head==null){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val=head.data;
                size--;
                return val;
            }
            int val =head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        DoubleLL ll= new DoubleLL();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();;
        
    }
}
