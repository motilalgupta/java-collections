package PracticeQuestions.IteratorQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Question03 {
    public static void main(String[] args) {
        // Iterator List in Backward Direction using hasPrevious() and previous() methods:

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i*10);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
