package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    // IO is preserved
    // Random access is not allowed
    // Duplicate is allowed
    // Growable in nature
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Pallavi");
        list.add("Vishal");
        list.add("Megha");
//        list.add("Motilal");
        list.add("Motilal");
        list.add("Mohit");

        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());
        System.out.println("All item: "+list);

//        list.get(); // @  get method is available then how random access is not allowed.
        // Because linkList class implement randomAccess interface which marker Interface
        int i;
        for(i = 0; i<2; i++){       // we are fetching 2nd index
            list.get(i);
        }
        System.out.println(list.get(i));
    }
}
