package tasks;

import java.util.Arrays;

public class DifferentNumberOfTwoArrays {

    //first way
    public static int findDifferenceUsingStream(int[] array1,int []array2) {    //I'll find the sum of
        return Arrays.stream(array1).sum()-Arrays.stream(array2).sum();         // two array and difference of them
    }

    public static void main(String[] args) {
        int[] a={11,22,33,44,55};
        int[] b={11,22,33,44};
        System.out.println( findDifferenceUsingStream(a,b));
    }

     //second way
//    public static int[] intersection(int[] a, int[] b) {                      //if there is more than 1 different number
//        return Arrays.stream(a)                                               //I'll use array to collect all of them
//                .distinct()
//                .filter(x -> Arrays.stream(b).noneMatch(y -> y == x))
//                .toArray();
//    }
//
//    public static void main(String[] args) {
//        int[] a={11,22,33,44,55};
//        int[] b={11,22,33,44};
//        System.out.println(Arrays.toString(intersection(a, b)));
//    }

    }

