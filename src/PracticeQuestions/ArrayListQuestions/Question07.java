package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        // Program to check whether	the	list contains element or not: contains() method	returns	true if the list has specified element.
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Scanner sc = new Scanner(System.in);
        System.out.println("List is: "+list);

        System.out.print("Enter the element to check contains or not: ");
        int ele = sc.nextInt();

        int index = list.indexOf(ele);

        if(list.contains(ele)){
            System.out.println("Yes element is present in the list at-"+index);
        }else{
            System.out.println("Element is not present in the list");
        }
    }
}
