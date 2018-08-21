package com.navis.shipping;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String args[]){

        int [] ranks = new int[5];
        ranks[0] = 3;
        ranks[1] = 2;
        ranks[2] = 4;
        ranks[3] = 1;
        ranks[4] = 5;
        Arrays.sort(ranks);

        System.out.println(Arrays.binarySearch(ranks, 1));

    }
}
