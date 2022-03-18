package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    /*Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
     */

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        System.out.println();
        list.stream().filter(x -> x % 2 == 0).map(x -> x*x).max(Integer:: compare).ifPresent(System.out::println);


    }





}


