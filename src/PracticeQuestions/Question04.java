package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question04 {
//    Insert element into specified	index: add(int index, E	e) method is used to insert	element	into
//    specified index.
//    Instructions to code:
//            • Create ArrayList with 5 elements 10, 20, 30, 40, 50
//            • Read index to insert.
//            • Check whether the index is present or not
//            • If the index is present, then read the value and insert.
//            • If the index is not present, display Error message.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    System.out.print("Enter the index to insert: ");
    int index = sc.nextInt();

    if(index>=0 && index<list.size()-1){
        System.out.print("Insert the index: ");
        int ele = sc.nextInt();
        list.add(index,ele);
    }else{
        System.out.println("Invalid Index");
    }
    System.out.println(list);
}
}
