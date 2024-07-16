import java.util.*;

public class Main {
  static Node head;
  
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      next = null;
    }
  }
  
  void push(int data){

    Node newnode = new Node(data);
    
    if(head==null){
      head = newnode;
    }
    else{    
      newnode.next = head;
      head = newnode;
    }
  }
  
  void pop(){
    if(head==null){
      System.out.println("stack is empty");
      return;
    }
    
    Node tp = head;
    head = head.next;
    System.out.println(tp.data);
  }
  
  void peek(){
    if(head==null){
      System.out.println("empty stack for peek");
      return;
    }
    
    System.out.println(head.data);
  }
  
  void disp(){
    Node tp = head;
    System.out.println("display stack");
    while(tp!=null){
      System.out.println(tp.data+" ");
      tp = tp.next;
    }
    System.out.println("end of stack");
  }
  public static void main(String[] args) {
    Main st = new Main();
    st.push(20);
    st.pop();
    st.peek();
    
    st.push(30);
    st.push(40);
    st.push(100);
    st.disp();
    st.pop();
    st.disp();
    
  }
}
