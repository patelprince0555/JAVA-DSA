public class linked_lists{

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

    public void add(int idx , int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        //i =idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val =head.data;
            head = tail=null;
            size=0;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val =prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        linked_lists ll = new linked_lists();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.add(3, 100);
        ll.print();
        // System.out.println(ll.size);
        ll.removefirst();
        ll.print();

        ll.removelast();
        ll.print();;

        
    }
}