package LinkedLists;

public class reverseList {
    //iterate
    //no extra memory must be used
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            
            currnode=currnode.next;
            
            
        }
        currnode.next=newnode;
    }
    public void reverselist(){
        if(head==null || head.next==null){
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        while(currnode!=null){
            Node nextnode=currnode.next;
            currnode.next=prevnode;
            //update
            prevnode=currnode;
            currnode=nextnode;

        }
        head.next=null;
        head=prevnode;

    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"-->");
            currnode=currnode.next;
        }
    }
    public static void main(String args[]){
        reverseList list=new reverseList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printlist();
        list.reverselist();
        System.out.println();
        list.printlist();

    }

    
}
