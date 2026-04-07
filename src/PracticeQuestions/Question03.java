package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question03 {
    //Program to display the element of specified index: (user entered index)
    //        • get(int index) returns the element of specified index.
    //We specify the error message – if the index value is not present:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
        System.out.println("The list is: "+list);
        System.out.print("Enter the index of list: ");
        int index = sc.nextInt();
        if(index>=0 && index<list.size()){
            System.out.println("The index-"+index+" contains value is: "+list.get(index));
        }else{
            System.out.println("Invalid Index");
        }
        /*
        try{
            System.out.println("The index-"+index+" contains value is: "+list.get(index));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        */
    }
}
