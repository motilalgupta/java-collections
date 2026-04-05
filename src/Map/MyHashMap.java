package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    // Duplicate is not allowed
    // IO is not preserved
    // Random access is not allowed
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("four",40);
        map.put(null,1);
        map.put(null,4); // null allowed at once only because duplicate keys not allowed

        System.out.println(map.get("four"));

        if(map.containsKey("four")){
            System.out.println(map.get("four"));
        }
        // Many ways to traverse

        for(String data : map.keySet()){
            System.out.println("Keys: "+data+" Value: "+map.get(data));
        }
        System.out.println("------------------------------------------");
        for(Integer value : map.values()){
            System.out.println("Values: "+value);
        }
        System.out.println("------------------------------------------");
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Keys: "+entry.getKey()+" Values: "+entry.getValue());
        }
        // Java 8
        System.out.println("------------------------------------------");
        map.forEach((key,value) -> {
            System.out.println("Keys: "+key+" Values: "+value);
        });
    }
}
