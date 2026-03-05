import java.util.*;
class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> a=new PriorityQueue<>();
        a.add(2);
        a.add(4);
        a.add(3);
        a.add(5);
        a.add(2);
        a.add(6);
        a.add(2);
        a.add(1);
        System.out.println(a);
        a.remove();
        a.remove();
        System.out.println(a);
     
        
    }
}