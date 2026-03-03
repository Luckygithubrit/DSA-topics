import java.util.*;
public class Doublylinkedlist {
    private Node head;
    private Node tail;
    private int size;
    public Doublylinkedlist(){
        this.head=null;
        this.tail=null;
        
    }
    class Node{
        String data;
        Node prev;
        Node next;
        public Node(String data){
            this.data=data;
            this.prev=null;
            this.next=null;
            size++;
        }
    }
    public void insertfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    
}
    public void insertlast(String data){
        Node newnode=new Node(data);
        if(tail==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void printforward(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
    public void printbackward(){
        Node current=tail;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.prev;
        }
    }
    private int getsize(){
        return size;
    }
    
public static void main(String[] args) {
    
    Doublylinkedlist list=new Doublylinkedlist();
    list.insertfirst("java");
    list.insertfirst("lucky");
    list.insertlast("chiku");
    list.insertfirst("bhAAi");
    list.insertlast("sgsf");
    System.out.println("print from forwardward");
    System.out.println("the size is:"+list.getsize());
    list.printforward();
    System.out.println("print from backward");
    System.out.println("the size is:"+list.getsize());
    list.printbackward();
    
    // System.out.println("size before deletion: "+list.getsize());
    // System.out.println("before deletion");
    // list.deletefirst();
    // list.deletelast();
    // list.printlist();
    // System.out.println("size after deletion: "+list.getsize());
    
    
    
}
}