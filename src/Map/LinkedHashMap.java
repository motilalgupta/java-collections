package Map;

import java.util.Map;

public class LinkedHashMap {
    // IO is preserved
    // duplicate is not allowed
    // Random access is not allowed
    public static void main(String[] args) {
        Map<Integer,String> lmap = new java.util.LinkedHashMap<>();
        lmap.put(1,"A");
        lmap.put(2,"B");
        lmap.put(3,"C");
        lmap.put(4,"D");
        lmap.put(5,"E");

        for(Integer data: lmap.keySet()){
            System.out.println("Key: "+data+" Value: "+lmap.get(data));
        }
    }
}
