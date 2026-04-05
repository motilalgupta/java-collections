package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(50,20,10,30,40));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
