public class Search_Recursive {

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


    public int helper(Node head ,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return-1;
        }
        return idx+1;

    }

    public int recsearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void delteNthfromend(int n){
        int sz=0;
        Node temp =head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iTofind = sz-n;
        Node prev = head;
        while(i<iTofind){
            prev=prev.next;
            i++;    
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome(){

        if(head==null || head.next==null){
            return true;
        }
        // step 1 find mid
        Node midnode= findmid(head);

        // step 2 reverse 2nd mid
        Node prev = null;
        Node curr = midnode;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;

        }

        Node right = prev;
        Node left =head;

        // step 3 check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Search_Recursive ll= new Search_Recursive();

        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        System.out.println(ll.recsearch(3));
        System.out.println(ll.recsearch(10));

        ll.print();
        ll.delteNthfromend(3);
        ll.print();
        
    }
}
