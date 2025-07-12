package com.fundamentals.java8.Streams.beginner;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Find Even Numbers
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream().filter(n -> n%2 == 0).forEach(System.out :: println);

        //Uppercase Strings
        List<String> list = List.of("mumbai","pune","delhi");
        list.stream().map(n -> n.toUpperCase()).forEach(System.out :: println);

        //Sum of squares of all the numbers in a list
        int sum = nums.stream().mapToInt(n -> n*n).sum();
        System.out.println("Sum: "+sum);

        //remove duplicates
        List<Integer> nums2 = Arrays.asList(1,1,3,3,5,1,7,3,9);
        nums2.stream().distinct().forEach(System.out :: println);

    }
}
