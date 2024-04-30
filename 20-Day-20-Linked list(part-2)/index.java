public class index{
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

    public static boolean iscycyle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1
            fast =fast.next.next;//+2

            if(slow==fast){
                return true;
            }
        }
        return false;// cylcle doesn't exist

    }
    public static  void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast= head;
        boolean cycle =false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // find meeting point
        slow =head;
        Node prev =null;//last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle-> last.next==null

        prev.next=null;
    }
    public static void main(String[] args) {
        
        head= new Node(1);
        Node temp =new Node (2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next= temp;
        // 1->2->3->2
        System.out.println(iscycyle());
        removecycle();
        System.out.println(iscycyle());
         
        
    }
}