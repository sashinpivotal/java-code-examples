package misc.examples_not_using_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {

        // Usage of non-genericized collection object
        List arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(5));
        arrayList.add(Long.valueOf(6));
        arrayList.add("xyz");  // my mistake

        Long aLong = (Long) arrayList.get(1);

        // Use genericized collection
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(5));
        numbers.add(Long.valueOf(6));
//        numbers.add("xyz");  // my mistake

        Number number = numbers.get(1);

    }
}
