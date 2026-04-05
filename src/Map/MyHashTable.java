package Map;

import java.util.Hashtable;
import java.util.Map;

public class MyHashTable {
    // duplicate is not allowed
    // HashTable is thread safe
    // IO is not preserved
    // Random access is not allowed
    public static void main(String[] args) {
        Map<String,Integer> m = new Hashtable<>();
        m.put("one",1);
        m.put("two",2);
        m.put("three",3);
        m.put("four",4);
        m.put("four",40);

        m.forEach((key,value) ->{
            System.out.println("Keys: "+key+" Values: "+value);
        });
    }
}
