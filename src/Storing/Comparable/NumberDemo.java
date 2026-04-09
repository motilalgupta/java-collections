package Storing.Comparable;

import java.lang.Comparable;

public class NumberDemo implements Comparable<NumberDemo> {

    int value;
    NumberDemo(int value){
        this.value=value;
    }

    @Override
    public int compareTo(NumberDemo o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "NumberDemo{" +
                "value=" + value +
                '}';
    }
}
