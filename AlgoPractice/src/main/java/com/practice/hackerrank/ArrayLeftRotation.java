package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        if(d==0 || d==a.size()) {
            return a;
        }
        List<Integer> resList = new ArrayList<>(a.size());
        for(int index=d; index < a.size(); index++) {
            resList.add(a.get(index));
        }
        for(int index=0; index < d; index++) {
            resList.add(a.get(index));
        }
        return resList;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(rotLeft(list, 5));
    }

}
