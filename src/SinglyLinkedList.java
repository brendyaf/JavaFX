/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Brandy
 */
//public class SinglyLinkedList<E> implements Stack2<E>{
//    private static class node<E>{
//        private E Element;
//        private node<E> next;
//
//        public node(E Element, node<E> next) {
//            this.Element = Element;
//            this.next = next;
//        }
//
//        public E getElement() {
//            return Element;
//        }
//
//        public node<E> getNext() {
//            return next;
//        }
//
//        public void setNext(node<E> next) {
//            this.next = next;
//        }
//          
//        
//    }
//    
//    private node<E> head;
//    private node<E> tail;
//    private int Size;
//
//    public SinglyLinkedList() {
//        
//    }
//    public int Size(){
//        return Size;
//    }
//    public boolean isEmpty(){
//        return Size == 0 ;
//    }
//    
//    public E first(){
//       if (isEmpty()) return null;
//           return head.Element;
//       
//    }
//
//    public E Last(){
//       if (isEmpty()) return null;
//           return tail.Element;
//       
//    }
//    
//    public void addFirst ( String e) throws IllegalStateException {
////       head = new node<E>(e, null); // node<E> newest = new node<E>(e,null);
////       newest.next=head;                      // newest.next = head;
////       head = newest;                         // if (isEmpty())
////       if (isEmpty())                         //   tail=head;
////           tail=head;                         // size++;
////       Size ++;       
//    }
//    
//    public void addLast(String e) throws IllegalStateException{
//        node<E> newest = new node<E>(e, null);
//        if (isEmpty ())
//            head=newest;
//        else 
//            tail.setNext(newest);
//        tail = newest;
//        Size ++;  
//    }
//    
//    public E removeFirst(){
//         if (isEmpty()) return null;
//         E answer = head.getElement();
//         head = head.next;
//         Size --;
//         if (Size == 0)
//             tail=null;
//         return answer;
//        
//         
//    }
//
//}
