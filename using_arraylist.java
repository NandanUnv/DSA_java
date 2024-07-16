import java.util.*;

public class Main {
  
  static class stack{
    static ArrayList<Integer> ob = new ArrayList<>();
    
    public static boolean isEmpty(){
      return ob.size()==0;
    }
    
    public static void push(int data){
      ob.add(data);
    }
    
    public static int pop(){
      if(isEmpty()){
        return -1;
  
      }
      else{
        int top = ob.get(ob.size()-1);
        ob.remove(ob.size()-1);
        return top;
      }
    }
    
    public static int peek(){
      if(isEmpty()){
        return -1;
      }
      else{
        int top = ob.get(ob.size()-1);
        return top;
      }
      
    }
    
    public static ArrayList disp(){
      return ob;
    }
  
  }
  public static void main(String[] args) {
      
      stack sb = new stack();
      
      System.out.println(sb.isEmpty());
      sb.push(20);
      sb.push(50);
      System.out.println(sb.disp());
      System.out.println(sb.peek());
      System.out.println(sb.pop());
      System.out.println(sb.pop());
      
  }
}
