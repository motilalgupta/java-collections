package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Qiuestion11 {
    public static void main(String[] args) {
        // Display	ArrayList	element	by	element	using	for-loop:
        // get(int index) method is used to retrieve each element using its index

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
        System.out.println("List is: "+list);
        for(int i = 0; i<=list.size()-1; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
