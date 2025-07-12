package com.fundamentals.java8.Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream<String> stream =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny(); // it will generate output
//        Optional<String> firstElement = stream.findFirst(); // it will throw IllegalStateException bcoz stream is already consumed in above line
//       i.e once terminal operation  is performed on streams it can't be reused.
//        because streams are designed to perform operation not to store the elements.
    }
}
