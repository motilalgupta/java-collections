package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Question01{
   // Program to display ArrayList and its size:
   //          • add() method is used to append element to the list
   //          • size() method returns the length of list.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List is: "+list);
        System.out.println("List size is: "+list.size());
    }
}
