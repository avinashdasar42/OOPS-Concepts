package com.fundamentals.java8;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> ops1 = Optional.empty();// this is how empty optional looks
        Optional<String> ops2 = Optional.of("someString");// this is how non-empty optional looks

        // Below Optional can be empty or non-empty based on str value
        String str = "someText"; //OR
//        String str = null;
        Optional<String> ops3 = Optional.ofNullable(str);
        System.out.println(ops3);
    }
}
