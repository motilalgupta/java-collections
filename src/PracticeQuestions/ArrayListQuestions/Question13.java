package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        // Program to Merge 2 ArrayLists: addAll(Collection c) method is used to merge 2 list.
        List<Integer> list1 = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list1.add(i);
        }
        System.out.println("List is: "+list1);

        List<Integer> list2 = new ArrayList<>();
        for(int i = 6; i<=10; i++){
            list2.add(i);
        }
        System.out.println("List is: "+list2);

        list1.addAll(list2);
        System.out.println("list1 list after merge: "+list1);
    }
}
