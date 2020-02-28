package sparta.em.engineering50.javabasics;

public class DivideAndMerge {

    /*method to divide array into one element sub array
    and then mergeSort them back into one array */
    public int[] divideSort(int[] array) {

        //initialise sub arrays into "Left" and "Right" subarrays
        //make the "left" sub array one longer if array length is odd
        int subLength = (array.length / 2) + (array.length % 2);
        int[] left = new int[subLength];
        int[] right = new int[array.length - subLength];

        for (int i = 0; i < array.length; i++) {
            if (i < subLength) {
                left[i] = array[i];
            } else {
                right[i - subLength] = array[i];
            }
        }
        //System.out.println("Left: " + Arrays.toString(left) + "Right " + Arrays.toString(right));

        //divide again until both subarrays are length 1 (or zero)
        if (left.length != 1) {
            left = divideSort(left);
            right = divideSort(right);
        }

        SortedMerger sortedMerger = new SortedMerger();
        return sortedMerger.sortedMerge(left, right); //finally use SortedMerger
    }
}

