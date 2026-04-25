package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class
Question12 {
    public static void main(String[] args) {
        // Program to display ArrayList in Reverse Order:
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Correct Order: "+list);

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
