package Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    // Duplicate is not allowed
    // IO is not preserved
    // Random access not allowed
    // Growable in nature
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(15);
        System.out.println("Set: "+set);
//        System.out.println(set.get());
    }
}
