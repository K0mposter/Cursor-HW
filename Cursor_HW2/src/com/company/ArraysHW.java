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

    //Task2: sum of positive numbs
    public static class sumOfPositive {
        public static void main(String[] args) {

            int[] nums2 = {1, 5, -3, 31, -19};
            int sumOfPositive = 0;
            for (int i : nums2) {
                if (i > 0) {
                    sumOfPositive = sumOfPositive + i;
                }
            }
            System.out.println(sumOfPositive);
        }
    }

    //Task3: Average
    public static class AverageOfList {
        public static void main(String[] args) {

            int[] nums3 = {1, 2, 4, 1};
            double average;
            double sum = 0;
            for (int j : nums3) {
                sum += j;
            }
            average = sum / nums3.length;
            System.out.println(average);
        }
    }

    //Task4: Replace duplicates
    public static class ReplaceDuplicates {
        public static void main(String[] args) {
            int[] nums4 = {3, 2, 3, 1, 4, 2, 8, 3};
            for (int i = 0; i < nums4.length; i++) {
                for (int j = i + 1; j < nums4.length; j++) {
                    if (nums4[i] == nums4[j]) {
                        nums4[j] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(nums4));
        }

    }
}