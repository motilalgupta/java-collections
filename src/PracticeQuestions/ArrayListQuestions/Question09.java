package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        // Program to replace the existing value: set(int index, E e) method replace the index element with specified element
        // Instructions to code:
        // Create ArrayList with elements.
        // Read the element to replace
        // Check the element is present or not in the list using contains() method.
        // If the element is present,
        // Read the new	element to replace with.
        // If the element is not present,
        // Display error message.
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
        System.out.println("List is: "+list);

        System.out.print("Enter element to replace: ");
        int replace = sc.nextByte();

        if(list.contains(replace)){
            System.out.print("Enter new element: ");
            int newEle = sc.nextInt();

            int loc = list.indexOf(replace);
            list.set(loc,newEle);
            System.out.println("Updated list: "+list);
        }else{
            System.out.println("No such element in the list");
        }
    }
}
