package Storing.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class NumberTest {
    public static void main(String[] args) {
        ArrayList<NumberDemo> list = new ArrayList<>();
//        NumberDemo n = new NumberDemo(10);
//        NumberDemo n1 = new NumberDemo(3);
//        NumberDemo n2 = new NumberDemo(5);
//        list.add(n);
//        list.add(n1);
//        list.add(n2);

        list.add(new NumberDemo(10));
        list.add(new NumberDemo(34));
        list.add(new NumberDemo(11));
        list.add(new NumberDemo(2));
        list.add(new NumberDemo(4));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
