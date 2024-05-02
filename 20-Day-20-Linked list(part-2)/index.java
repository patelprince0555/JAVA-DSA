// import java.util.LinkedList;

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

    private Node getmid(Node head){
         Node slow =head;
         Node fast = head.next;
         while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1 != null && head2!= null){
            if(head1.data<=head2.data){
                temp.next=head;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        // find mid
        Node mid =getmid(head);

        // left & right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight = mergeSort(rightHead); 

        // merge
        return merge(newLeft,newRight);
    }

    public void zigzag(){
        // find mid
        Node slow = head;
        Node fast=head.next;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        Node mid = slow;


        // reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right =prev;
        Node nextl,nextr;


        // alt merge ->zig zag merge
        while(left!=null&&right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left = nextl;
            right=nextr;
        }
    }

    public static void main(String[] args) {
        
        // head= new Node(1);
        // Node temp =new Node (2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next= temp;
        // // 1->2->3->2
        // System.out.println(iscycyle());
        // removecycle();
        // System.out.println(iscycyle());
         index ll =new index();
         ll.addlast(1);
         ll.addlast(2);
         ll.addlast(3);
         ll.addlast(4);
         ll.addlast(5);
         ll.print();
        //  ll.head=ll.mergeSort(ll.head);
        //  ll.print();
        ll.zigzag();
        ll.print();;



        
    }
}