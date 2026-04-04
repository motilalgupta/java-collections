package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // duplicate allowed
        // IO preserved
        // Random Access allowed
        // Growable in nature
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(20);
        System.out.println(nums);
        System.out.println(nums.get(3));    // random access

        // some common methods of collections
        System.out.println(nums.size());

        if(nums.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("Not empty...");
        }

        nums.add(3,90);
        System.out.println(nums);


        // iterator

       Iterator<Integer> it = nums.iterator();

       while(it.hasNext()){
           int data = it.next();
           if(data == 30){
               System.out.println("Removing 30");
               it.remove();
           }else{
               System.out.println(data);
           }
       }
    }
}
