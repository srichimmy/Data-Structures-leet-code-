package LinkedLists;
class sizeLL {
    //size
    private int size;
    //size constructor
    sizeLL(){
        this.size=0;

    }
    //create head
    Node head;
    class Node{
        String data;
        Node next;
        //constructor
        Node(String data){
        this.data=data;
        this.next=null;
        size++;
        
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
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;//assign head to next data
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;//head.next is null then lastnode is null
        while(lastNode.next!=null){//null.next
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;

    }
    public static void main(String[] args) {
        sizeLL list=new sizeLL();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("linked");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("list");
        list.printList();
        System.out.println(list.getSize());
    }

    
}


    

