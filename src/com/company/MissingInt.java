package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class MissingInt {
    //declaration of a priority queue, with a reversed ordering
    PriorityQueue<Integer> numbers = new PriorityQueue<Integer>(Collections.reverseOrder());
    int last, sum;

    public MissingInt(int[] inputArrays) {
        //populating the input array into the priority queue for ordering, from largest to smallest
        numbers.addAll(Arrays.stream(inputArrays).boxed().collect(Collectors.toList()));
        //reading the top most int no the queue(the largest number)ad
        last = numbers.peek() - 1;
        //calculating the sum of all natural numbers up to the largest number retrived
        sum = (last + 1) * (last + 2) / 2;
        checker();

    }

    private void checker() {
        int a = 1;
        for (int e : numbers) {

            sum = sum - e;
            //System.out.println(e);
        }
        //System.out.println(sum);


    }

    public int getDigit() {
        return sum;
    }

}