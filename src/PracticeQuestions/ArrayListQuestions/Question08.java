package PracticeQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question08 {
    // Program	display	the	index value of element : indexOF() method returns index of specified element.
    // It returns -1 if no such elements in the list.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<=5; i++){
            list.add(i);
        }
        System.out.println("List is: "+list);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inter the index of element: ");
        int ele = sc.nextInt();
        int index = list.indexOf(ele);
        if(index!=-1){
            System.out.println("Index element is: "+index);
        }else{
            System.out.println("Index is not present");
        }
    }
}
