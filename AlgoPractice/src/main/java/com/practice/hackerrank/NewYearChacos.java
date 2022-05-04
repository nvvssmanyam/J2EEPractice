package com.practice.hackerrank;

import java.util.Arrays;
import java.util.List;

public class NewYearChacos {

    public static int minimumBribes(List<Integer> q) {
        // Write your code here
        int diff, steps = 0;
        for(int i=q.size(); i>0; i--) {
            for(int j=0; j<(i-1); j++) {
                // First sorting max element
                if(i == q.get(j)) {
                    diff = (j+1) - q.get(j);
                    if(diff == -1) {
                        // one swap required
                        swap(q, j);
                        steps++;
                    } else if (diff == -2) {
                        // Two swaps required
                        swap(q, j);
                        swap(q, j+1);
                        steps = steps+2;
                    } else if(diff < -2) {
                        System.out.println("Too chaotic");
                        return 0;
                    }
                }
            }
        }
        System.out.println(steps);
        return steps;
    }

    public static int minimumBribes2(List<Integer> q) {
        int diff = 0, steps = 0, balance = 0;
        for(int i=0; i<q.size(); i++) {
            diff = (i+1) - q.get(i);
            if(diff < -2) {
                System.out.println("Too chaotic");
                return 0;
            }
            balance = balance + diff;
            if(diff < 0) {
                steps = steps + Math.abs(diff);
            }
        }
        if(balance != 0) {
            System.out.println("Something wrong...");
        }
        System.out.println(steps);
        return steps;
    }

    /*public static int minimumBribes1(List<Integer> q) {
        int diff, steps = 0;
        for(int i=(q.size()-1); i<0; i--) {
            diff = (i+1) - q.get(i);
            if(diff == -1) {
                // one swap required
                swap(q, i);
                steps++;
                i = i-1;
            } else if (diff == -2) {
                // Two swaps required
                swap(q, i);
                steps++;
                i = i-1;
            } else if(diff < -2) {
                System.out.println("Too chaotic");
                return 0;
            }
        }
        System.out.println(steps);
        return steps;
    }*/

    public static int minimumBribes1(List<Integer> q) {
        int diff = 0, steps = 0;
        for(int i=(q.size()-1); i>0; i--) {
            if((i+1) != q.get(i)){
                //Check where previous index has that value
                if((i+1) == q.get(i-1)) {
                    System.out.println("Before sort :: "+q);
                    swap(q, i-1);
                    System.out.println("After sort :: "+q);
                    steps++;
                } else if ((i+1) == q.get(i-2)) {
                    System.out.println("Before sort 2 :: "+q);
                    swap(q, i-2);
                    swap(q, i-1);
                    System.out.println("After sort 2 :: "+q);
                    steps = steps + 2;
                } else {
                    System.out.println("Too chaotic");
                    return 0;
                }
            }
        }
        System.out.println(steps);
        return steps;
    }

    public static void swap(List<Integer> q, int source) {
        int temp = q.get(source);
        int dest = source + 1;
        q.set(source, q.get(dest));
        q.set(dest, temp);
    }

/*    public static void swap(List<Integer> q, int source) {
        int temp = q.get(source);
        int dest = source + 1;
        q.set(source, q.get(dest));
        q.set(dest, temp);
    }*/

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 5, 3, 7, 8, 6, 4};
        Integer[] arr2 = {1, 2, 5, 3, 4, 7, 8, 6};
        List<Integer> list = Arrays.asList(arr);
        minimumBribes1(list);
    }


}
