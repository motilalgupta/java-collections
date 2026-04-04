package List_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java","DSA","Python","DevOps"));
        ListIterator<String> li = list.listIterator();

        System.out.println(list);

        System.out.println("Forward Direction");
        while(li.hasNext()){
            String data = li.next();
            if (data == "DSA") {
                li.set("React");
                System.out.println(list);
            }
        }
        System.out.println("Backword Direction");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println(list);
    }
}
