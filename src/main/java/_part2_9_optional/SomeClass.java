package _part2_9_optional;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class SomeClass {

    public String someMethod() {
        return null;
    }

    public Optional<String> someMethod2() {
        return Optional.empty();
    }
}

class Main {
    public static void main(String[] args) {
//        SomeClass aObject = new SomeClass();
//        String string = aObject.someMethod();
//        if (string != null) {
//            String s = string.toUpperCase(Locale.ROOT);
//        }
//
//        Optional<String> optionalS = aObject.someMethod2();
//        if (optionalS.isPresent()) {
//            String s = optionalS.get();
//            s.length();
//        }

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> s.toUpperCase())
                .filter(s -> {
                    System.out.println(s);
                    return s.startsWith("B");
                })
                .forEach(s -> System.out.println(s));
        ; // no print

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> s.toUpperCase())
                .filter(s -> s.startsWith("B")); // no print


    }
}
