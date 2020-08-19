package algorithms.hackkerrank.arrays;

public class ArrayManipulation {
    public static long arrayManipulation(int n, int [] [] queries){
        long [] arrToManipulate = new long[n];
//        for(int i=0; i<arrToManipulate.length; i++){
//            arrToManipulate[i]=0;
//        }

        for (int row = 0 ; row < queries.length; row++){
            int startingIndex = queries[row][0]-1;
            int finalIndex = queries[row][1]-1;
            long numberToAdd = queries[row][2];

            for(int i = startingIndex ; i <= finalIndex ; i++){
                arrToManipulate[i]+=numberToAdd;
            }
        }

        long max = arrToManipulate[0];
        for(long a : arrToManipulate){
            if(a>max){
                max=a;
            }
        }
        return max;

    }
}
