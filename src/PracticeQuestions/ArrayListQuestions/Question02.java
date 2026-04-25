package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question02 {
    // Program to check the list is empty or not:
    // • isEmpty() method returns true if the list doesn’t contains elements else returns false
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List contains empty : "+list);
        }
    }
}
