package algorithms.hackkerrank.arrays;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a n x n 2D Array arr:
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in arr 's graphical representation:
 *
 * a b c
 *   d
 * e f g
 *
 * There are 16 hourglasses in arr , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
 */

public class HourGlassArr {
    public static int hourGlassSolution(int[][] arr) {
        int size = arr.length;
        List <Integer> sumList = new LinkedList<>();

        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < size - 2; j++) {
                int sum = 0;
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i + 1][j + 1] + arr[i+2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sumList.add(sum);
            }
        }
       sumList.sort((o1, o2) -> o1 >= o2 ? -1 : 1);

        return sumList.get(0);

    }


}