package LinkedLists;


public class reverseLLrecursive {
    //recursive
    ListNode head;
    class ListNode{
        int data;
        ListNode next;
        ListNode (int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
        }
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println();
    }
    public ListNode reverserecursive(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverserecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }

    public static void main(String args[]){
        reverseLLrecursive list=new reverseLLrecursive();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printlist();
        list.head=list.reverserecursive(list.head);
        System.out.println();
        list.printlist();

    }

    
}
