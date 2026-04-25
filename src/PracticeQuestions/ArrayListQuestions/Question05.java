package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {
    // Program to remove all element from the list. clear() method removes all elements from the list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        if(list.isEmpty()){
            System.out.println("List is Empty");
        }else{
            System.out.println("List is not Empty");
        }
        list.clear();
        if(list.isEmpty()){
            System.out.println("List is Empty");
        }else{
            System.out.println("List is not Empty");
        }
    }
}
