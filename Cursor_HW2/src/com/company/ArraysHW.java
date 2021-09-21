package com.company;

import java.util.Arrays;
import java.util.Collections;

//Arrays have dedicated allocation in memory
public class ArraysHW {

    public static void main(String[] args) {
        //Task1: Sorting array in descending order
        Integer[] nums1 = {2, 3, 1, 7, 11};
        Arrays.sort(nums1, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums1));

    }
}