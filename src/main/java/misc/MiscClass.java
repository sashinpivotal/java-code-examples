package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MiscClass {
    public static void main(String[] args) {

        String[] myStrings = {"sang", "lorenzo", "kiaya"};
        List<String> strings = Arrays.asList(myStrings);
        System.out.println(strings);

        List<String> strings2 = Arrays.asList("david", "tom", "jon", "paul");
        System.out.println(strings2);

        Object[] objects = strings2.toArray();
        String[] strings1 = strings2.toArray(new String[]{});
    }
}
