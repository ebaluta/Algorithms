package algorithms.hackkerrank.arrays;

/**
 * You are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n]
 * without any duplicates. You are allowed to swap any two elements.
 * You need to find the minimum number of swaps required to sort the array in ascending order.
 */
public class MinimumSwaps {
    public static int minimumSwaps(int [] arr){
        int swaps = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i+1){
               int temp = i;
               while(arr[temp] != i+1 ){
                   temp++;
               }
               int t= arr[i];
               arr[i]=temp;
               arr[temp]=t;
               swaps++;
            }
        }

        return swaps;
    }
}
