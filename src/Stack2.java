/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Brandy
 */
public interface Stack2 <E>{
        public int Size();
    public boolean isEmpty();
    
    
    public E first();

    public E Last();
    
    public void addFirst ( String e);
    
    public void addLast(String e);
    
    public E removeFirst();

    public void push(char c);
}
