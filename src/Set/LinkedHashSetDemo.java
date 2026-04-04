package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    // IO is preserved
    // Random access is not allowed
    // Duplicate is not allowed
    // Growable in nature
    public static void main(String[] args) {
        Set<Integer> lhset = new LinkedHashSet<>();
        lhset.add(10);
        lhset.add(20);
        lhset.add(30);
        System.out.println(lhset);
    }
}
