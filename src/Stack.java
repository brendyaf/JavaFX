
public interface Stack <E>{
   
    
        int size(); // regresa el numero del stack
        /**
         * True si esta vacio y False si no esta esta vacio
         * @return 
         */
        boolean isEmpty();
        /**
         * Agrega fatos al stack
         */
        void push (E e); 
        /**
         * Elimina un elemento en la fila
         * @return 
         */
         E pop();
        /**
         * regresa pero no elimina el elemento superior de la pila y si no encuentra nada se pone null
         * @return 
         */
        E top(); 
    
        
        
      
        
        
    
}
   
