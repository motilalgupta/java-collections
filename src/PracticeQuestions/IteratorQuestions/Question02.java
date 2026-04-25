package PracticeQuestions.IteratorQuestions;

import java.util.*;

public class Question02 {
    public static void main(String[] args) {
        // Iterator List in Forward Direction using hasNext() and next() methods:
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i*5);
        }
        ListIterator listItr = list.listIterator();

        while(listItr.hasNext()){
            System.out.print(listItr.next()+" ");
        }
    }
}
