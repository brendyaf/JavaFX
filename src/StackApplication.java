

import java.util.Arrays;

    
/**
 *
 * @author Brandy
 */
public class StackApplication {
    public static <E> void reverse(E[ ] a) {
    Stack<E> buffer = new ArrayStack<>(a.length);
    for (int i=0; i < a.length; i++)
    buffer.push(a[i]);
    for (int i=0; i < a.length; i++)
    a[i] = buffer.pop();
 }


public static void main(String args[ ]) {
 Integer[ ] a = {4, 8, 15, 16, 23, 42}; // Integer(Objeto) vs Int(dato primitivo)
 String[ ] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
 System.out.println("a = " + Arrays.toString(a));
 System.out.println("s = " + Arrays.toString(s));
 System.out.println("Reversing...");
 reverse(a);
 reverse(s);
 System.out.println("a = " + Arrays.toString(a));
 System.out.println("s = " + Arrays.toString(s));
 }
 
// public static boolean isMatched(String expression) {
//    final String opening = "({["; // opening delimiters
//    final String closing = ")}]"; // respective closing delimiters
//    Stack<Character> buffer = new LinkedStack<>();
//    for (char c : expression.toCharArray( )) {
//        if (opening.indexOf(c) != -1)
//         buffer.push(c);
//        else if (closing.indexOf(c) != -1) { 
//         if (buffer.isEmpty()) // nothing to match with
//        return false;
//    if (closing.indexOf(c) != opening.indexOf(buffer.pop( )))
//    return false; // mismatched delimiter
//       }
//    }
//    return buffer.isEmpty(); // were all opening delimiters matched?
//}


}
