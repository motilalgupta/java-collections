package PracticeQuestions.IteratorQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question04 {
    public static void main(String[] args) {
        // Display list from specified index value:
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i*4);
        }
        ListIterator listIterator = list.listIterator(4);
        while(listIterator.hasNext()){
            System.out.println("The element is: "+listIterator.next());
        }
    }
}
