package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    // Gives element in sorted order
    // Duplicate is not allowed
    // IO is not preserved
    // Random access is not allowed
    // Growable in nature
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(60);
        set.add(29);
        set.add(39);
        set.add(10);
        set.add(200);
        set.add(150);
        System.out.println(set);
    }
}
