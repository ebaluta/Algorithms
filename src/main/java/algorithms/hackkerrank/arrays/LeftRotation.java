package algorithms.hackkerrank.arrays;

public class LeftRotation {

    public static int[] rotLeft(int[] a, int d) {
        int[] toManipulate = a;
        while (d > 0) {
            int temp = toManipulate[0];
            for (int i = 0; i < a.length - 1; i++) {
                toManipulate[i] = toManipulate[i + 1];
            }
            toManipulate[a.length - 1] = temp;
            d--;
        }
        return a;
    }


}
