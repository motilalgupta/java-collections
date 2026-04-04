package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    // Thread safe
    // IO is preserved
    // Random access is allowed
    // Duplicate is allowed
    // Growable in nature
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);// legacy class and Thread safe(all methods are synchronized in vector class).
        System.out.println(vector);


        Enumeration<Integer> e = vector.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
