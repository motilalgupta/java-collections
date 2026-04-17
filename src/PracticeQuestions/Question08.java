package PracticeQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
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
