package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Scanner sc = new Scanner(System.in);
        System.out.println("List is: "+list);

        int ele = sc.nextInt();
        if(list.contains(ele)){
            System.out.println("Yes element is present in the list");
        }else{
            System.out.println("Element is not present in the list");
        }
    }
}
