package LinkedLists;

class LL {//LL is already exists in java
    //create head
    Node head;
    class Node{//it contains the data node and next pointer
        String data;
        Node next;//the type of next is also a Node

        //constructor
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add-first,last
    //add-first ==>add at first position(head is the first position)
    public void addFirst(String data){
        Node newNode=new Node(data);//first create a new node
        if(head==null){//if LL is empty the new node is the first and head
            head=newNode;
            return;
        }//else
        newNode.next=head;//point the new node next to head(which is first element)
        head=newNode;//make the head as new node(which is the first element inserted)
    }
    //add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"==>");
            currNode=currNode.next;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        LL list=new LL();//object
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("List");
        list.printList();

        
    }
    
    
}
