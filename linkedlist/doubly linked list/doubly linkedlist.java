import java.util.*;
public class Doublylinkedlist {
    private Node head;
    private Node tail;
    private int size;
    private int position;
    public Doublylinkedlist(){
        this.head=null;
        this.tail=null;
        
    }
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
            size++;
        }
    }
    public void insertfirst(int data){
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
    public void insertlast(int data){
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
    public void insertAtposition(int position,int data){
        if(position<0||position>=size){
            System.out.println("not a valid position");
        }
        Node newnode=new Node(data);
        if(position==0&&head!=null){
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        else{
            Node current=head;
            for(int i=0;i<position-1;i++){
                current=current.next;
            }
            newnode.next=current.next;
            if(current.next!=null){
                current.next.prev=newnode;
            }
            newnode.prev=current;
            current.next=newnode;
        }
        // size++;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
            
    }
    public void deletelast(){
        if(tail==null){
            System.out.println("list is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    public void deleteAtposition(int position){
        if(position<0||position>=size){
            System.out.println("not a valid position");
            return;
        }
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(position==0&&head!=null){
            head=head.next;
            head.prev=null;
        }
        // size--;
        Node current=head;
        for(int i=0;i<position;i++){
            current=current.next;
        }
        if(current.next==tail){
            current.prev.next=null;
        }
        else{
            current.prev.next=current.next;
            current.next.prev=current.prev;
        }
        size--;
    }
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
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
    list.insertfirst(1);
    list.insertfirst(2);
    list.insertlast(3);
    list.insertfirst(4);
    list.insertlast(5);
    list.insertAtposition(2,33);
    System.out.println("before deletion");
    list.print();
    
    list.deleteAtposition(1);
    System.out.println("after deletion");
    list.print();
    System.out.println("after deletion at first");
    list.deletefirst();
    list.print();
    System.out.println("print from forwardward");
    System.out.println("the size is:"+list.getsize());
    list.printforward();
    System.out.println("print from backward");
    System.out.println("the size is:"+list.getsize());
    list.printbackward();
    
  
    
    
    
}
}