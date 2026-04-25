package PracticeQuestions.IteratorQuestions;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question01 {
    public static void main(String[] args) {
        // Program to display ArrayList using Iterator:
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer elements = iterator.next();
            System.out.print(elements+" ");
        }
    }
}
