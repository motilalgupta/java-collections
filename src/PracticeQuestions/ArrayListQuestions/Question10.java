package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        // Program to display ArrayList using for-each loop:
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        for(Integer data: list){
            System.out.println(data);
        }
    }
}
