import java.util.*;

public class Main {
  // creating Node
  public static class Node{
    int data;
    Node next;
    
    Node(int data){
      this.data = data;
      this.next = null;
    }
    
  }
  
  static Node head;
  
  // inserting node at end
  public static void push(int a){
    Node newnode = new Node(a);
    
    if(head==null){
      head = newnode;
      return;
    }
    else{
      Node n = head;
      while(n.next!=null){
        n = n.next;
      }
      n.next = newnode;
    }
  }
  
  // display linkedlist elements
  public static void disp(){
    Node tp = head;
    
    while(tp.next!=null){
      System.out.print(tp.data+" ");
      tp =  tp.next;
    }
    System.out.print(tp.data);
  }
  
  // removing node from particular position
  public static void remv(int pos){
    int ind = 0;
    Node r = head;
    
    if(pos==0){
      head = head.next;
      return;
    }
    
    while(ind+1!=pos && r.next!=null){
      r = r.next;
      ind++;
    }
    r.next = r.next.next;
    
  }
  
  // inserting node at particular position
  public static void inser(int data, int pos){
    
    Node newnode = new Node(data);
    
    int ind = 0;
    
    if(ind==pos){
      newnode.next = head;
      head = newnode;
      return;
    }
    
    Node pt = head;
    
    while(ind+1 != pos){
      pt = pt.next;
      ind++;
    }
    Node nene =  pt.next;
    pt.next = newnode;
    newnode.next = nene;
  }
  // main method
  public static void main(String[] args) {
      push(34);
      push(22);
      push(109);
      disp();
      remv(2);
      System.out.println();
      disp();
      System.out.println();
      push(56);
      push(80);
      disp();
      inser(200,3);
      disp();
  }
}
