

/**
 *
 * @author Brandy
 */
public class ArrayStack <E> implements Stack<E> {
    public static final int CAPACITY =1000;
    private E[] data;
    private int t = -1;

   public ArrayStack (){this (CAPACITY);}
   
   public ArrayStack (int capacity){
       data = (E[])new Object [capacity];  // object --> String --> int () --> E[].  por la herencia va hacia arriba, el padre de todo es Object
   }
   public int size(){
        return (t + 1);}
   
   public boolean isEmpty(){
        return (t== -1);}
   
   public void push(E e) throws IllegalStateException{
        if (size () == data.length) throw new IllegalStateException ("Stack is full");
        data [++t]=e; // ++t es prefijo primero es la accion y luego su contexto, primero se incrementa t 
   }
   
   public E top(){
       if (isEmpty()) return null;
       return data[t];
   }
   
   public E pop(){
       if (isEmpty()) return null;
       E answer = null;
       data[t] = null;
       t--;
       return answer;
   }

  
   
   
}
