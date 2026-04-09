package Storing.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(1);
        list.add(33);
        list.add(23);
        list.add(15);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
