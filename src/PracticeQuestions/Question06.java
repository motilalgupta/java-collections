package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.print("Enter the index to remove: ");
        int loc = sc.nextInt();
        if(loc>=0 && loc<=list.size()){
            list.remove(loc);
            System.out.println("List is: "+list);
        }else{
            System.out.println("Error: no such index to remove");
        }
    }
}
