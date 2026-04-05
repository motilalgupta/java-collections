package Map;

import java.util.Map;
import java.util.TreeMap;

public class MyHashTree {
    // duplicate is not allowed
    // gives result in sorted order
    // IO is not preserved
    // Random access is not allowed
    public static void main(String[] args) {
        Map<Integer,String>  treemap = new TreeMap<>();
        treemap.put(1,"Apple");
        treemap.put(2,"Banana");
        treemap.put(3,"Mango");
        treemap.put(4,"Pineapple");
        treemap.put(5,"Grapes");

        for(Integer data: treemap.keySet()){
            System.out.println("Keys: "+data+" Values: "+treemap.get(data));
        }
        System.out.println("Tree Map: "+treemap);

        System.out.println(treemap.get(2));

        // removing 3
        treemap.remove(3);
        System.out.println("After removing three: "+treemap);
    }
}
