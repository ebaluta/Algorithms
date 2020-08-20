package algorithms.hackkerrank.sorting;

public class BubleSort {

    public static void countSwaps(int [] a){
        int [] toSort = a.clone();
        int counter = 0;
        boolean flag = false;

        while (!flag){
            flag=true;
            for(int i = 0 ; i< a.length-1; i++){
                if(toSort[i] > toSort[i+1]){
                    int temp = toSort[i];
                    toSort[i]=toSort[i+1];
                    toSort[i+1]=temp;
                    flag=false;
                    counter++;
                }
            }
        }

       System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d",counter,
               toSort[0],toSort[toSort.length-1]);
    }

}
