package sparta.em.engineering50.javabasics;

public class SortedMerger {

    //this method implements combining the elements of two sorted arrays into a combined sorted array
    public int[] sortedMerge(int[] array1, int[] array2) {
        int length = array1.length + array2.length; //get combined array length
        int[] combinedArray = new int[length]; // create an empty array with combined length
        int pointer1 = 0;
        int pointer2 = 0;
        int pointerCombined = 0;

        //adding elements to the combined array
        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] <= array2[pointer2]) {
                combinedArray[pointerCombined++] = array1[pointer1++]; //add element then increment array1 and combined
            } else if (array2[pointer2] < array1[pointer1]) {
                combinedArray[pointerCombined++] = array2[pointer2++]; //add element then increment array2 and combined
            }
        }
        //if the end of one of the arrays is reached, just add rest of the other array to the combined
        if (pointer1 == array1.length) {
            while (pointer2 < array2.length) {
                combinedArray[pointerCombined++] = array2[pointer2++];
            }
        } else if (pointer2 == array2.length) {
            while (pointer1 < array1.length) {
                combinedArray[pointerCombined++] = array1[pointer1++];
            }
        }
        return combinedArray;

    }
}
